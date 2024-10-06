package POO.execs;

import POO.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class ExecBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank bank;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.next();
        System.out.print("Is there a initial deposit(y/n)? ");
        char oneDep = sc.next().charAt(0);;

        if(oneDep == 'y'){
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            bank = new Bank(number,holder,balance);
        }else{
            bank = new Bank(holder,number);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        bank.deposit(sc.nextDouble());
        System.out.println("Update account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        bank.withdraw(sc.nextDouble());
        System.out.println("Update account data: ");
        System.out.println(bank);




    }
}
