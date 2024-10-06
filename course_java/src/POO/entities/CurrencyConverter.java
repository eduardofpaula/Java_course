package POO.entities;

public class CurrencyConverter {
    private double price;
    private double dollar;
    private double dollarWTax;

    public void mult(double price, double dollar){
        this.dollarWTax = price * dollar;
    }

    public double converter(){
        return dollarWTax + (((double) 6 / 100)*dollarWTax);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }
}
