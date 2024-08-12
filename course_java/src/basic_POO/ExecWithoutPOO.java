package basic_POO;

import java.util.Locale;
import java.util.Scanner;

public class ExecWithoutPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double xa,xb,xc,ya,yb,yc;
        System.out.println("Enter the measures of triangle X:");
        Scanner sc = new Scanner(System.in);
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double p1,p2,areaX,areaY;
        p1 = (xa + xb + xc) / 2;
        p2 = (ya + yb + yc) / 2;
        areaX = Math.sqrt(p1*(p1-xa)*(p1-xb)*(p1-xc));
        areaY = Math.sqrt(p2*(p2-ya)*(p2-yb)*(p2-yc));

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);

        if(areaX > areaY){
            System.out.println("Larger area: " + areaX);
        }else{
            System.out.println("Larger area: " + areaY);
        }
    }
}
