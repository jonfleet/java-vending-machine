package com.company.classes;

import java.math.BigDecimal;

public class DrinkItem extends Product {
    public DrinkItem(String slotLocation, String name, BigDecimal price, String type){
        super(slotLocation, name, price, type);
        FunnyMessage = "Gulp Gulp, Yum!";
    }
}
