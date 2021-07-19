package com.company.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class VendingMachine {

    // Properties
    private HashMap<String, Queue<Product>> Inventory = new HashMap<String, Queue<Product>>();

    // Getters
    public HashMap<String, Queue<Product>> getInventory() {return Inventory;}
    // Constructors
    public boolean stockInventory() {
        String fileName = "vendingmachine.csv";
        //String directory = Environment.CurrentDirectory;
        //String filePath =
        return true;
    }
}
