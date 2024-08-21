package POO.entities;

public class Triangle {
    // Atributos
    public double a;
    public double b;
    public double c;

    // Método para calcular a área do triângulo
    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
