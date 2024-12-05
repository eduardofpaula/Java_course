package Array.Execs;

import java.util.Scanner;


public class teste {

//7
//4 5
//13 10
//6 4
//3 3
//3 5
//3 4
//3 8

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma=0;

        for(int i =0;i<=n;i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x>y){
                for (int a=y+1;a<=x-1;a++){
                    if(a % 2 != 0){
                    soma+=a;
                    }
                }
            }else {
                for (int a=x+1;a<=y-1;a++){
                    if(a % 2 != 0){
                        soma+=a;
                    }
                }
            }
            System.out.println(soma);
            soma=0;
        }
    }
}
