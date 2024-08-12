package basic_java.mathematical_functions;

public class funcoes_matematicas {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A = 0;
		double B = 0;
		double C = 0;
		
		
		//Math.sqrt = raiz quadrada
		
		A = Math.sqrt(A);
		B = Math.sqrt(B);
		C = Math.sqrt(C);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + z + " = " + C);
		
		//Math.pow = numero elevado
		
		A = Math.pow(x,y);
		A = Math.pow(x,2.0);
		A = Math.pow(5.0,2.0);
		
		System.out.println(x + "elevado a " + y + " = " + A);
		System.out.println(x + "elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}

}
