package com.company.classes;

import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleService {

    // Properties
    private VendingMachine VendingMachine;
    private Person User;

    // Constructors
    public ConsoleService(VendingMachine wm, Person user){
        VendingMachine = wm;
        User = user;
    }

    // Methods
    public void run(){

        if(VendingMachine.stockInventory()){
            startMenu();
        } else {
            System.out.println("Inventory Not Stocked Correctly. Please restart program.");
        }
    }

    private void startMenu(){
        String userSelection;
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        while(true){
            System.out.println("");
            System.out.println("Welcome to Java Vending Machine");
            System.out.println("1) Display Vending Machine Items");
            System.out.println("2) Purchase");
            System.out.println("3) Exit");
            System.out.println("");
            userSelection = scanner.nextLine();

            if(userSelection == "1"){
                //Display VM Console
                System.out.println("VM Console");
            } else if (userSelection == "2"){
                // Purchase Menu
                System.out.println("Purchase Menu");
            } else if (userSelection == "3"){
                break;
            }
        }
    }
}
