package basic_java.estructure_while;

import java.util.Scanner;

public class repetitive_structure {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         int x = sc.nextInt();
         int soma = 0;

         while (x != 0) {
             x = sc.nextInt();
             soma = x + soma;

         }

            System.out.println("SOMA DOS NUMEROS: " + soma);

         sc.close();

     }
}
