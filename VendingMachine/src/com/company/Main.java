package com.company;

public class Main {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine("College Branch");

        vendingMachine.resetVendingMachine();

        vendingMachine.buyProducts(3, 50);

    }
}
