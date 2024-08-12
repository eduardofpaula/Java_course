package basic_java.estructure_for;

import java.util.Scanner;

public class exec_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            float a = sc.nextInt();
            float b = sc.nextInt();
            if (b == 0) {
                System.out.println("divisão impossivel");
            } else {
                double divisao = a / b;
                System.out.println(divisao);
            }
        }
        sc.close();
    }
}
