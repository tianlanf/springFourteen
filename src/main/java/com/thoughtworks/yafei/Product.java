package com.thoughtworks.yafei;

public class Product {
    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private String name;

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    private int amount;

    @Override
    public String toString() {
        return name;
    }
}
