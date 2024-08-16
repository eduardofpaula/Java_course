package basic_POO.entities;

import basic_POO.ExecProduct;

public class Product {
    //Atributos
    public String name;
    public double price;
    public int quantity;

    // Metodos , acesso, tipo metodo, nome
    public double TotalValueInStock(){
        return price * quantity;
    }

    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", TotalValueInStock());
    }
}
