package com.company.classes;

public class ChangeService {

    // Properties
    private int Quarter;
    private int Dime;
    private int Nickel;
    private int[] ChangeList = new int[3];

    // Methods
    public int[] getChange(double amount){
        double total = amount;
        while(total > 0.00)
        {
            if(total >= 0.25){
                // Add Quater to the List
                Quarter++;
                total -= 0.25;
            } else if( total >= 0.10) {
                Dime++;
                total -= 0.10;
            } else if(total  >= 0.05){
                Nickel++;
                total -= 0.05;
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
