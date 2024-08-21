package POO.execs;

import POO.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Employee funcionario = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        funcionario.setName(sc.nextLine());
        System.out.print("Gross salary: ");
        funcionario.setGrossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        funcionario.setTax(sc.nextDouble());
        System.out.println();
        System.out.println("Employee: " + funcionario);
        System.out.print("Which percentage to increase salary?");
        funcionario.IncreaseSalary(sc.nextDouble());
        System.out.println("Update data: " + funcionario);
    }
}