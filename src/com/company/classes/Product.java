package com.company.classes;

public class Product {
    public String SlotLocation;
    public String Name;
    public Double Price;
    public String Type;
    public String FunnyMessage;

    public Product(){}

    public Product(String slotLocation, String name, Double price, String type ){
        SlotLocation = slotLocation;
        Name = name;
        Price = price;
        Type = type;
    }
}
