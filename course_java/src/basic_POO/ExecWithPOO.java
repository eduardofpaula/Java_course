package basic_POO;

import basic_POO.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ExecWithPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Criação de dois objetos do tipo Triangle
        Triangle x,y;
        // Instanciando os objetos
        x = new Triangle();
        y = new Triangle();

        Scanner sc = new Scanner(System.in);

        // Atribuindo valores aos atributos dos objetos
        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        // Atribuindo valores aos atributos dos objetos
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Calculando a área dos triângulos
        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);

        if(areaX > areaY){
            System.out.println("Larger area: " + areaX);
        }else{
            System.out.println("Larger area: " + areaY);
        }
    }
}
