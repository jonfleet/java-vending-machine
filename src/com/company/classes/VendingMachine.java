package com.company.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.*;

public class VendingMachine {

    // Properties
    private HashMap<String, Queue<Product>> Inventory = new HashMap<String, Queue<Product>>();
    private String fileName = "\\vendingmachine.csv";
    private String directory = System.getProperty("user.dir");
    private String filePath = directory + fileName;


    // Getters
    public HashMap<String, Queue<Product>> getInventory() {return Inventory;}
    // Constructors
    public boolean stockInventory() {

        File dataFile = new File(filePath);
        try (Scanner dataInput = new Scanner(dataFile)) {
            while (dataInput.hasNext()){
                String line = dataInput.nextLine();
                String[] temp = new String[4];
                temp = line.split("\\|");

                if(temp[3].trim().toLowerCase().equals("drink")){
                    // Add Drink
                    DrinkItem drink = new DrinkItem(temp[0], temp[1], new BigDecimal(temp[2]), temp[3]);
                    queueFiveItemsAndAddToInventory(drink);
                }

                if(temp[3].trim().toLowerCase().equals("candy")){
                    // Add Candy
                    CandyItem candy = new CandyItem(temp[0], temp[1], new BigDecimal(temp[2]), temp[3]);
                    queueFiveItemsAndAddToInventory(candy);
                }

                if(temp[3].trim().toLowerCase().equals("chip")){
                    // Add Chip
                    ChipItem chip = new ChipItem(temp[0], temp[1], new BigDecimal(temp[2]), temp[3]);
                    queueFiveItemsAndAddToInventory(chip);
                }

                if(temp[3].trim().toLowerCase().equals("gum")){
                    // Add Gum
                    GumItem gum = new GumItem(temp[0], temp[1], new BigDecimal(temp[2]), temp[3]);
                    queueFiveItemsAndAddToInventory(gum);
                }


            }
        } catch (FileNotFoundException ex) {

            System.err.println("The file does not exist.");
            return false;
        }
        return true;
    }

    private void queueFiveItemsAndAddToInventory(Product product){
        Queue<Product> queue = new LinkedList<Product>();

        for (int i = 0; i < 5; i++){
            queue.add(product);
        }

        Inventory.put(product.getSlotLocation(), queue);
    }

}
