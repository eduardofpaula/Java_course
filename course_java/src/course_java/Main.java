package course_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Ola Mundo");
		int a = 32;
		double x = 238.921382;
		System.out.println(a);
		System.out.println(x);
		// imprmir numeros ou strings formatadas %f

		System.out.printf("%.2f\n",x);
		System.out.printf("%.4f\n",x);
		
		System.out.println("RESULTADO = " + x + "METROS");
		System.out.printf("RESULTADO = %.2f metros%n",x);
		
		//string=%s
		//double=%f
		//int=%d
		//quebra de linha=%n
		
		String nome = "Maria";
		int idade = 40;
		double renda = 2383.837478;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais", nome, idade, renda);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("\n\nProducts:");
		System.out.printf("%s, which price is $ %.2f\n",product1,price1);
		System.out.printf("%s, which price is $ %.2f\n\n",product2,price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n",age,code,gender);
		System.out.println("Measure with eight decimal places:" + measure);
		System.out.printf("Rouded (three decimal places): %.3f",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f",measure);
				
	}

}
