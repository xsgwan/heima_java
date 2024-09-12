package com.gyy.interface_demo1;

public class Book implements Product {
    private double price;
    private String name;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
