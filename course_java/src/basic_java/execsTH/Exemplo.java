package basic_java.execsTH;

import java.util.ArrayList;
import java.util.Arrays; // importações
import java.util.Comparator;
import java.util.List;

public class Exemplo {
    public static class Pessoa {
        private final boolean ativo;
        private final String nome;
        private final int idade;

        public Pessoa(boolean ativo, String nome, int idade) {
            this.ativo = ativo;
            this.nome = nome;       // definindo e inicializando 3 atributos ativo, nome e idade
            this.idade = idade;
        }

        public boolean isAtivo() {
            return ativo;
        }

        public String getNome() {  // metodos para acessar os atributos da classe
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {   // toString para ter uma representação da instância da classe
            return "Pessoa[ativo=" + ativo + ", nome='" + nome + "', idade=" + idade + "]";
        }
    }

    public static final Comparator<Pessoa> COMPARATOR = (e1, e2) -> {
        if (e1.isAtivo()) {
            if (!e2.isAtivo()) {
                return -1;
            }
        } else if (e2.isAtivo()) { // se e1 é ativo e e2 não é, e1 deve ser ordenado antes de e2, retornando -1
            return 1;                               // se e1 não é ativo e e2 é, e1 deve ser ordenado depois de e2,
            // retornando 1
        }                                           // comparator retorna 0 se os dois ativos forem iguais

        int compare = e1.getNome().compareTo(e2.getNome()); // por isso se compara com compareTo os nomes, por ordem
        // alfabetica caso os ativos forem iguais
        if (compare != 0) {
            return compare;
        }

        compare = e2.getIdade() - e1.getIdade(); // compara as idades subtraindo e2 por e1
        return compare;
    };

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(
                new Pessoa(false, "Maria", 10),
                new Pessoa(true, "Pedro", 5),
                new Pessoa(false, "Maria", 20),
                new Pessoa(false, "Pedro", 5),
                new Pessoa(true, "João", 50)
        ));

        pessoas.sort(COMPARATOR);
        System.out.println(pessoas);
    }
}
