package com.company.classes;

import java.math.BigDecimal;
import java.util.*;

public class Person {

    // Properties
    private BigDecimal Balance = new BigDecimal("0.00");
    private ArrayList<Product> CartItems = new ArrayList<Product>();
    private VendingMachine VendingMachine;
    private BigDecimal CartTotal = new BigDecimal("0.00");

    // Constructors
    public Person (VendingMachine vm) {
        VendingMachine = vm;
    }
    // Getters
    public BigDecimal getCartTotal(){
        return CartTotal;
    }
    public BigDecimal getBalance(){ return Balance; }

    // Setters
    public ArrayList<Product> getCartItems(){ return CartItems; }

    // Methods
    public boolean addBalance(String amount){
        //LogService logger = new LogService();
        if(Double.parseDouble(amount) < 0){
            return false;
        }
        try {
            BigDecimal moneyAmount = new BigDecimal(amount);
            Balance = Balance.add(moneyAmount);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Product selectProduct(String slotLocation) throws Exception {
        HashMap<String, Queue<Product>> inventory = VendingMachine.getInventory();

        Queue<Product> productQueue = new LinkedList<Product>();

        try {
            productQueue.add(inventory.get(slotLocation).remove());
        } catch (Exception e) {
            throw new Exception("Invalid Slot Location Selected");
        }

        try {
            if(Balance.compareTo(productQueue.peek().getPrice()) > 0){
                Product product = productQueue.remove();
                CartItems.add(product);
                Balance = Balance.subtract(product.getPrice());
                return product;
            }
        } catch (Exception e){
            if(productQueue.size() <= 0) {
                throw new Exception("Sold Out");
            }
        }

        throw new Exception("Insufficient Balance");
    }

    public Boolean closeOutAccount(){
        Balance = new BigDecimal("0");
        CartItems = new ArrayList<Product>();
        return true;
    }
}
