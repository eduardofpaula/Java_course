package execs_estrut_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class exec_5 {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int cod1,num1,cod2,num2;
		double valor1,valor2,valorFinal;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorFinal = (num1 * valor1) + (num2 * valor2);
		
		System.out.printf("VALOR A PAGAR = %.2f", valorFinal);
		
		sc.close(); 
		
	}

}
