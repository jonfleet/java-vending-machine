package com.company.classes;

import java.util.ArrayList;
import java.util.Locale;

public class Person {

    // Properties
    private Double Balance = 0.00;
    private ArrayList<Product> CartItems = new ArrayList<Product>();
    private VendingMachine VendingMachine;
    private double CartTotal = 0.0;

    // Constructors
    public Person (VendingMachine vm) {
        VendingMachine = vm;
    }
    // Getters
    public double getCartTotal(){
        return CartTotal;
    }

    // Setters
    public double GetBalance(){ return Balance; }
    public ArrayList<Product> getCartItems(){ return CartItems; }

    // Methods
    public boolean AddBalance(String amount){
        LogService logger = new LogService();

        return true;
    }

    public Product selectProduct(String slotLocation) {
        return new Product();
    }

}
