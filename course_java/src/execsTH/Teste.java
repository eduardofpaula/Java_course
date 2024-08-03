package execsTH;


public class Teste {
    public void divisiveis(int inicio, int fim) {
        for (int numero = inicio; numero <= fim; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("Touch Health");
            } else if (numero % 3 == 0) {
                System.out.println("Touch");
            } else if (numero % 5 == 0) {
                System.out.println("Health");
            } else {
                System.out.println(numero);
            }
        }
    }
    public static void main (String[]args){
        Teste teste = new Teste();
        teste.divisiveis(1, 100);
    }
}