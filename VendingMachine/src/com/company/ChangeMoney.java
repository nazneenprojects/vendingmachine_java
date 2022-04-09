package com.company;

public class ChangeMoney {
    String nameCM;
    int quantity;

    public ChangeMoney(String name, int quantity) {
        this.nameCM = name;
        this.quantity = quantity;
    }

    public String getName() {
        return nameCM;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ChangeMoney{" +
                "nameCM='" + nameCM + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
