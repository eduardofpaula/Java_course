package POO.entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        double aumento = percentage * grossSalary / 100;
        this.grossSalary += aumento;
    }

    @Override
    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", NetSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}

