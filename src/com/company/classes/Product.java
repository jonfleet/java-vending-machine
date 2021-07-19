package com.company.classes;

public class Product {
    private String SlotLocation;
    private String Name;
    private Double Price;
    private String Type;
    private String FunnyMessage;
    // Getters
    public String getName(){return Name;};
    public String getSlotLocation(){return SlotLocation;};
    public Double getPrice(){return Price;}
    public String getType(){return Type;};
    public String getFunnyMessage() {return FunnyMessage;};

    // Setters

    // Constructors
    public Product(){}

    public Product(String slotLocation, String name, Double price, String type ){
        SlotLocation = slotLocation;
        Name = name;
        Price = price;
        Type = type;
    }
}
