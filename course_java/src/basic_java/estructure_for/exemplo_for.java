package basic_java.estructure_for;

import java.util.Scanner;

public class exemplo_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos a serem somados: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            soma += x;
        }

        sc.close();

        System.out.println("Soma: " + soma);
    }
}
