package com.gyy.interface_demo1;

public class Electronic implements Product {
    private double price;
    private String name;

    public Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price * 1.2;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        // 自定义展示逻辑
        System.out.println("电子产品: " + getName());
        System.out.println("价格: " + getPrice() + " 元 (含税)");
    }
}

