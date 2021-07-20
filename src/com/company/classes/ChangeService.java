package com.company.classes;

import java.math.BigDecimal;

public class ChangeService {

    // Properties
    private int Quarter;
    private int Dime;
    private int Nickel;
    private int[] ChangeList = new int[3];

    // Methods
    public int[] getChange(BigDecimal amount){
        BigDecimal total = amount;
        BigDecimal zero = new BigDecimal("0.00");
        BigDecimal nickel = new BigDecimal("0.05");
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal quarter = new BigDecimal("0.25");
        while(total.compareTo(zero) > -1 )
        {
            if(total.compareTo(quarter) >= 0 ){
                // Add Quarter to the List
                Quarter++;
                total.subtract(quarter);
            } else if( total.compareTo(dime) >= 0) {
                Dime++;
                total.subtract(dime);
            } else if(total.compareTo(nickel) >= 0){
                Nickel++;
                total.subtract(nickel);
            } else {
                break;
            }
        }

        ChangeList[0] = Quarter;
        ChangeList[1] = Dime;
        ChangeList[2] = Nickel;

        return ChangeList;
    }
}
