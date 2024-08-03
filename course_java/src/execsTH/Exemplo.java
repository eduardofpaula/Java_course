package execsTH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exemplo {
    public static class Pessoa {
        private final boolean ativo;
        private final String nome;
        private final int idade;

        public Pessoa(boolean ativo, String nome, int idade) {
            this.ativo = ativo;
            this.nome = nome;
            this.idade = idade;
        }

        public boolean isAtivo() {
            return ativo;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return "Pessoa[ativo=" + ativo + ", nome='" + nome + "', idade=" + idade + "]";
        }
    }

    public static final Comparator<Pessoa> COMPARATOR = (e1, e2) -> {
        if (e1.isAtivo() && !e2.isAtivo()) {
            return -1;
        } else if (!e1.isAtivo() && e2.isAtivo()) {
            return 1;
        }

        int compare = e1.getNome().compareTo(e2.getNome());
        if (compare != 0) {
            return compare;
        }

        compare = e2.getIdade() - e1.getIdade();
        return compare;
    };

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(
                new Pessoa(true, "Ana", 30),
                new Pessoa(false, "Bruno", 25),
                new Pessoa(true, "Carlos", 40),
                new Pessoa(false, "Diana", 35),
                new Pessoa(true, "Elisa", 50)
        ));

        pessoas.sort(COMPARATOR);
        System.out.println(pessoas);
    }
}
