package estructure_in_out;
import java.util.Locale;
import java.util.Scanner;

public class exec_4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
//		
		int numFunc;
		double horaTrab,valorH,salario;
		
		Scanner sc = new Scanner(System.in);
		
		numFunc = sc.nextInt();
		horaTrab = sc.nextDouble();
		valorH = sc.nextDouble();
		
		salario = valorH * horaTrab;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f" , salario);
		
		sc.close();
		
	}
}
