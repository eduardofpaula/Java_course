package execs_estrut_condicional;

import java.util.Scanner;

public class exec_5 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero correspondente ao dia da semana: ");
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor Invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);

		sc.close();

	}
}
