package estructure_for;

import java.util.Scanner;

public class exec_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
