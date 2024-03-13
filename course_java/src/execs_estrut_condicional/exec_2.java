package execs_estrut_condicional;

import java.util.Scanner;

public class exec_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,divisao;
		
		System.out.printf("Digite um numero: ");
		x = sc.nextInt();
		
		divisao = x % 2;
		
		if ( divisao == 0) {
			System.out.println("PAR");
			
		}else {
			System.out.println("IMPAR");
		}
	
		sc.close();

	}

}
