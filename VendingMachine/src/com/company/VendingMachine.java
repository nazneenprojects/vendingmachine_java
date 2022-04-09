package com.company;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    String nameVM;
    List<ChangeMoney> changeMoney;
    List<Products> products;

    public VendingMachine(String name) {
        this.nameVM = name;
        products = new ArrayList<Products>();
        changeMoney = new ArrayList<ChangeMoney>();
    }

    // reseting the vending machine by adding inventory of product and change money.
    public void resetVendingMachine() {
        products.add(new Products("COKE", 25, 20));
        products.add(new Products("PEPSI", 35, 20));
        products.add(new Products("SODA", 45, 20));
        changeMoney.add(new ChangeMoney("25", 20));
        changeMoney.add(new ChangeMoney("10", 20));
        changeMoney.add(new ChangeMoney("5", 20));
        changeMoney.add(new ChangeMoney("1", 20));
        System.out.println("The vending machine has been reset.");
    }

    // BuyProducts checks if money is greater than price and then returns the change.
    // Pending - the price amount should get added in the changeMoney class.
    public void buyProducts(int productId, int money) {
        int temp = money - products.get(productId - 1).getCost();
        int[] coins = new int[4];
        int[] index = {25, 10, 5, 1};

        System.out.println("Returning Coins as below: ");
        for (int i=0; i<index.length; i++) {
            coins[i] = temp / index[i];
            temp = temp % index[i];
            System.out.print("; Coin" + index[i] + "s = " + coins[i]);
        }

        if ((products.get(productId - 1).getQuantity() > 0) && money > products.get(productId - 1).getCost()) {

            products.get(productId - 1).setQuantity(products.get(productId - 1).getQuantity() - 1);
            changeMoney.get(0).setQuantity(changeMoney.get(0).getQuantity() - coins[0]);
            changeMoney.get(1).setQuantity(changeMoney.get(1).getQuantity() - coins[1]);
            changeMoney.get(2).setQuantity(changeMoney.get(2).getQuantity() - coins[2]);
            changeMoney.get(3).setQuantity(changeMoney.get(3).getQuantity() - coins[3]);

            System.out.println(" ");
            System.out.println(products.get(productId - 1).getName() + " has quantity = " + products.get(productId - 1).getQuantity());
            System.out.println("Coin " + changeMoney.get(0).getName() + " has quantity = " + changeMoney.get(0).getQuantity());
            System.out.println("Coin " + changeMoney.get(1).getName() + " has quantity = " + changeMoney.get(1).getQuantity());
            System.out.println("Coin " + changeMoney.get(2).getName() + " has quantity = " + changeMoney.get(2).getQuantity());
            System.out.println("Coin " + changeMoney.get(3).getName() + " has quantity = " + changeMoney.get(3).getQuantity());

        } else {
            System.out.println("The purchase cannot be made..");
        }
    }

}
