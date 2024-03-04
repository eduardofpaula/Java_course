package execs_estrut_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class exec_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo,pi;
		
		pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = A * C / 2;
		areaCirculo = pi * Math.pow(C, 2); 
		areaTrapezio = (A + B) * C / 2;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n",areaTriangulo);
		System.out.printf("CIRCULO: %.3f\n",areaCirculo);
		System.out.printf("TRAPEZIO: %.3f\n",areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n",areaQuadrado);
		System.out.printf("RETANGULO: %.3f\n",areaRetangulo);
		
		sc.close();

	}

}
