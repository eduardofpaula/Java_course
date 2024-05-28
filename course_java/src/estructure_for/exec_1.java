package estructure_for;

import java.util.Scanner;

public class exec_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int impar = x;
        for (int i=0; i <= impar;i++){

            if(x % 2 != 0){
                System.out.println(x);
            }
            x = x - 1;
        }
    }
}
