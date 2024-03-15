package execs_estrut_condicional;

import java.util.Scanner;

public class exec_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o inicio da partida: ");
		int hInicio = sc.nextInt();
		System.out.println("Digite o final da partida: ");
		int hFinal = sc.nextInt();
		
		if (hInicio > hFinal) {
			int hCorreta = hInicio - hFinal;
			hCorreta = 24 - hCorreta;
			
			System.out.printf("O JOGO DUROU " + hCorreta + " HORAS");
		} else if (hInicio < hFinal) {
			int hCorreta = hFinal - hInicio;
			
			System.out.printf("O JOGO DUROU " + hCorreta + " HORAS");
		} else {
			System.out.printf("O JOGO DUROU 24 HORAS");
		}
		
		sc.close();

	}

}
