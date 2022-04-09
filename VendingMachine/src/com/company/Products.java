package com.company;

public class Products {
    private String namePN;
    private int cost;
    private int quantity;

    public Products(String name, int cost, int quantity) {
        this.namePN = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    enum namePN {COKE, PEPSI, SODA }

    public String getName() {
        return namePN;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
