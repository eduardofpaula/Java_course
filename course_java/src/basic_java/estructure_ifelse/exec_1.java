package basic_java.estructure_ifelse;

import java.util.Scanner;

public class exec_1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.printf("Digite um número: ");
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("Negativo");
		}else if (x > 0){
			System.out.println("Positivo");
		}
		else {
			System.out.println("Zero não é valido");
		}		
		
		sc.close();
	}
}
