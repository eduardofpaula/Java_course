package execs_estrut_condicional;

import java.util.Scanner;

public class exec_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x,y;

		System.out.printf("Digite um numero: ");
		x = sc.nextInt();
		y = sc.nextInt();

		

		if ((x % y == 0) && (y % x == 0)){
			System.out.println("SÃO MULTIPLOS");

		} else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}

		sc.close();

	}

}
