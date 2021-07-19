package com.company;

import com.company.classes.ConsoleService;
import com.company.classes.Person;
import com.company.classes.VendingMachine;

public class Main {

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        Person user = new Person(vm);
        ConsoleService vendingMachineCLI = new ConsoleService(vm, user);

        vendingMachineCLI.run();
    }
}
