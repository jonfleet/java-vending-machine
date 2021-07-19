package com.company.classes;

import java.io.Console;
import java.io.InputStreamReader;
import java.util.*;

public class ConsoleService {

    // Properties
    private VendingMachine VendingMachine;
    private Person User;
    private Scanner Scanner = new Scanner(new InputStreamReader(System.in));

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


        while(true){
            System.out.println("");
            System.out.println("Welcome to Java Vending Machine");
            System.out.println("1) Display Vending Machine Items");
            System.out.println("2) Purchase");
            System.out.println("3) Exit");
            System.out.println("");
            userSelection = Scanner.nextLine();

            if(userSelection.equals("1")){
                displayVendingMachineItemsConsole();
            } else if (userSelection.equals("2")){
                purchaseMenu();

            } else if (userSelection.equals("3")){
                break;
            }
        }
    }

    private void purchaseMenu(){
        String userSelection;

        while(true){
            System.out.println("");
            System.out.println("");
            System.out.println("1) Feed Money");
            System.out.println("2) Select Product");
            System.out.println("3) Finish Transaction");
            System.out.println("");
            System.out.println("Current Balance is " + User.GetBalance());
            System.out.println("");
            System.out.println("Current Cart Total is " + User.getCartTotal());
            System.out.println("");
            System.out.println("Products in cart: ");
            System.out.println("");

            // Print out Products currently in the cart
            List<Product> cartItems = User.getCartItems();

            for(Product item : cartItems){
                System.out.println(item.getName());
            }

            System.out.println("");
            userSelection = Scanner.nextLine();

            if(userSelection.equals("1")){
                feedMoneyConsole();

            } else if(userSelection.equals("2")){
                selectProductConsole();
            } else if(userSelection.equals("3")){
                //finishTransactionConsole();
                break;
            }
        }
    }

    private void feedMoneyConsole(){
        String userSelection = "y";

        do {

            while(true){
                System.out.println("");
                System.out.println("Please enter the amount of cash you wish to deposit.");
                System.out.println("Whole Integer values required or press 'E' to exit.");

                String userInput = Scanner.nextLine();

                if(userInput.toUpperCase().equals("E")){
                    userSelection = "n";
                }

                if(!User.AddBalance(userInput)){
                    System.out.println("Invalid Entry. Please Try Again.");
                } else {
                    break;
                }
            }

            while (!userSelection.equals("n")){
                System.out.println("Would you like to enter another bill? (Y/N)");
                userSelection = Scanner.nextLine();

                if(userSelection.toLowerCase().equals("y") || userSelection.toLowerCase().equals("n")){
                    break;
                }
            }
        } while (userSelection.toLowerCase().equals("y"));
    }

    private void displayVendingMachineItemsConsole(){
        System.out.println("");

        String column1 = "Location";
        String column2 = "Name";
        String column3 = "Price";
        String column4 = "Qty Remaining";

        HashMap<String, Queue<Product>> manifest = VendingMachine.getInventory();

        System.out.println(" " + column1 + "  " + column2 + "  " + column3 + "  " + column4 + "  ");

        // Foreach through the HashMap<>;
    }

    private boolean selectProductConsole(){
        displayVendingMachineItemsConsole();

        System.out.println("Please enter the product location or press 'E' to Exit:" );
        String selection = Scanner.nextLine();

        if(selection.toUpperCase().equals("E")){
            return false;
        }

        try{
            Product selectedProduct = User.selectProduct(selection.toUpperCase().trim());

            System.out.println("");
            System.out.println("Dispensing: " + selectedProduct.getType());
            System.out.println(selectedProduct.getFunnyMessage());
            System.out.println("");
            return true;
        } catch (Exception e){
            System.out.println("");
            System.out.println(e.getMessage());
            System.out.println("");
            return true;
        }
    }
}
