package Array.Execs;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
        int maiorIdade = idade[0];
        int posicaoMaior = 0;
        for (int i = 0; i < n; i++) {
            if(idade[i] > maiorIdade){
                maiorIdade = idade[i];
                posicaoMaior = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[posicaoMaior]);
    }
}
