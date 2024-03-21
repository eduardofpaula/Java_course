package execs_estrut_repetitivas;

import java.util.Scanner;

public class exec_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while ((x != 0) && (y != 0)) {

            if ((x > 0) && (y > 0)) {
                System.out.println("First");
                break;
            } else if ((x < 0) && (y > 0)) {
                System.out.println("Second");
                break;
            } else if ((x < 0) && (y < 0)) {
                System.out.println("Third");
                break;
            } else if ((x > 0) && (y < 0)) {
                System.out.println("Fourth");
                break;
            }
        }

        sc.close();

        System.out.println("Numero Invalido");
    }
}
