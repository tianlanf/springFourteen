package com.thoughtworks.yafei;

public class Supermarket {
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmountOfProducts() {
        return amountOfProducts;
    }

    public void setAmountOfProducts(int amountOfProducts) {
        this.amountOfProducts = amountOfProducts;
    }

    private Product product;
    private int amountOfProducts;

    @Override
    public String toString() {
        return "The most popular goods in the supermarket is " + product.toString() + " and the amount is " + amountOfProducts;
    }
}
