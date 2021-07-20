package com.company.classes;

import java.math.BigDecimal;

public class GumItem extends Product {

    public GumItem(String slotLocation, String name, BigDecimal price, String type) {
        super(slotLocation, name, price, type);
        FunnyMessage = "Chew Chew, Yum!";
    }

}
