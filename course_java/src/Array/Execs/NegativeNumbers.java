package Array.Execs;

import java.util.Locale;
import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you type? ");
        int a = sc.nextInt();
        int[] vect = new int[a];

        for(int i=0; i < vect.length;i++){
            System.out.print("Digite um numero: ");
            int x = sc.nextInt();
            vect[i] = x;
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i=0; i < vect.length;i++){
            if(vect[i]<0){
                System.out.println(vect[i]);
            }
        }
    }
}
