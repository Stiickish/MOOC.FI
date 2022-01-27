/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yelon
 */
public class Product { //Product class

    private String name;        //Variabels to create products
    private double price;
    private int quantity;

    //Constructor. it takes the variables as parameters.
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;

    }
    //New method printProduct. It prints the constructor

    public void printProduct() {
        System.out.println(name + " " + price + " " + quantity + " pcs");
    }
}
