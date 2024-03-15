package execs_estrut_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exec_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero do lanche: ");
		int item = sc.nextInt();
		int quantidade = sc.nextInt();
		String lanche;
		double valorTotal;

		switch (item) {
		case 1:
			lanche = "Cachorro Quente";
			valorTotal = quantidade * 4;

			System.out.println("Pedido: " + lanche);
			System.out.printf("Total: R$ %.2f", valorTotal);
			break;
		case 2:
			lanche = "X-Salada";
			valorTotal = quantidade * 4.5;

			System.out.println("Pedido: " + lanche);
			System.out.printf("Total: R$ %.2f", valorTotal);
			break;
		case 3:
			lanche = "X-Bacon";
			valorTotal = quantidade * 5;

			System.out.println("Pedido: " + lanche);
			System.out.printf("Total: R$ %.2f", valorTotal);
			break;
		case 4:
			lanche = "Torrada Simples";
			valorTotal = quantidade * 2;

			System.out.println("Pedido: " + lanche);
			System.out.printf("Total: R$ %.2f", valorTotal);
			break;
		case 5:
			lanche = "Refrigerante";
			valorTotal = quantidade * 1.5;

			System.out.println("Pedido: " + lanche);
			System.out.printf("Total: R$ %.2f", valorTotal);
			break;

		}
		sc.close();

	}

}
