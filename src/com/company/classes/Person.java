package com.company.classes;

import java.util.ArrayList;

public class Person {

    public Double Balance = 0.00;
    public ArrayList<Product> CartItems = new ArrayList<Product>();
    private VendingMachine VendingMachine;

    public Person (VendingMachine vm){
        VendingMachine = vm;
    }


}
