package com.company.classes;

import java.math.BigDecimal;

public class CandyItem extends Product{

    public CandyItem(String slotLocation, String name, BigDecimal price, String type) {
        super(slotLocation, name, price, type);
        FunnyMessage = "Crunch Crunch, Yum!";
    }
}
