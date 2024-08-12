package basic_java.estructure_for;

import java.util.Scanner;

public class exec_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int resultado=1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        System.out.printf("O fatorial de %d é %d",n,resultado);
    }
}
