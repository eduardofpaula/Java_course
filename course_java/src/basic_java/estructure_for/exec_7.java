package basic_java.estructure_for;

import java.util.Scanner;

public class exec_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double quadrado = 0;
        double cubo = 0;
        for (int i = 1; i <= n; i++){
            quadrado = Math.pow(i,2);
            cubo = Math.pow(i,3);
            System.out.println(i + " " + quadrado + " " + cubo);
        }
    }
}
