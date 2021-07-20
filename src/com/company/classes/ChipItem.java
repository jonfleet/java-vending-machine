package com.company.classes;

import java.math.BigDecimal;

public class ChipItem extends Product{

    public ChipItem(String slotLocation, String name, BigDecimal price, String type) {
        super(slotLocation, name, price, type);
        FunnyMessage = "Munch Munch, Yum!";
    }

}
