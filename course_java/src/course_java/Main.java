package course_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
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
	}

}
