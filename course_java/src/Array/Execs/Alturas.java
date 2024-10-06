package Array.Execs;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int a = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[a];
        int[] idade = new int[a];
        double[] altura = new double[a];

        for (int i=0;i < a; i++ ){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        System.out.println(" ");
        double soma = 0;
        double quantMenor16 = 0;
        for(int i=0;i<a;i++){
            soma = soma + altura[i];
            if(idade[i] < 16){
                quantMenor16++;
            }
        }
        double media = soma / a;
        double menor16Anos = (quantMenor16 * 100) / a;
        System.out.println("Altura média: " + media);
        System.out.println("Pessoas com menos de 16 anos: " + menor16Anos + "%");
        for (int i=0;i<a;i++){
            if(idade[i] < 16){
                System.out.println(nome[i]);
            }
        }
    }
}
