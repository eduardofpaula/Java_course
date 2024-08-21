package POO.execs;

import POO.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height: ");
        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeight(sc.nextDouble());
        double areaRectangle = rectangle.area();
        double perimeterRectangle = rectangle.perimeter();
        double diagonalRectangle = rectangle.diagonal();
        System.out.println("AREA = " + areaRectangle);
        System.out.println("PERIMETER = " + perimeterRectangle);
        System.out.println("DIAGONAL = " + diagonalRectangle);
    }
}
