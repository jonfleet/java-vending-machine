package com.company.classes;

import java.math.BigDecimal;

public class Product {
    private String SlotLocation;
    private String Name;
    private BigDecimal Price;
    private String Type;
    protected String FunnyMessage;
    // Getters
    public String getName(){return Name;};
    public String getSlotLocation(){return SlotLocation;};
    public BigDecimal getPrice(){return Price;}
    public String getType(){return Type;};
    public String getFunnyMessage() {return FunnyMessage;};

    // Setters

    // Constructors
    public Product(){}

    public Product(String slotLocation, String name, BigDecimal price, String type ){
        SlotLocation = slotLocation;
        Name = name;
        Price = price;
        Type = type;
    }
}
