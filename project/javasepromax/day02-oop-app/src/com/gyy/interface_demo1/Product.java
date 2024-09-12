package com.gyy.interface_demo1;

import java.util.UUID;

public interface Product {
    double getPrice();
    String getName();

    default void showDetails() {
        System.out.println("商品名称: " + getName());
        System.out.println("商品价格: " + getPrice() + " 元");
        showCommonInfo();
    }

    default void showShortDetails() {
        System.out.println(getName() + ": " + getPrice() + " 元");
        showCommonInfo();
    }

    // 私有方法：用于展示商品的通用信息
    private void showCommonInfo() {
        System.out.println("这是一个通用的商品信息展示功能");
    }

    // 静态方法：生成一个商品的唯一标识符
    static String generateProductID() {
        return UUID.randomUUID().toString();
    }
}
