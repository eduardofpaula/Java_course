package POO.entities;

public class Bank {
    private String holder;
    private final int number;
    private double balance;

    // inicio se não tiver deposito inicial
    public Bank(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }
    // Sobrecarga, construtor dependendo dos parametros recebidos
    // Vai iniciar assim se tiver deposito inicial
    public Bank(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    // deposito, vai receber um dinheiro e vai aumentar o saldo
    public void deposit(double amount){
        balance += amount;
    }
    // saque, vai receber um parametro e subtrair do saldo com uma taxa de 5 reais
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Conta: "
                + number
                + ", "
                + "Holder: "
                + holder
                + ", "
                + "Balance: "
                + String.format("%.2f", balance);
    }
}