package com.gyy.Abstract_1;

public class Test {
    public static void main(String[] args) {
        // 目标:掌握抽象类的好处
        Animal a = new Cat();
        a.setName("叮当猫");
        a.cry(); // 更好的支持多态

        Animal a1 = new Dog();
        a1.setName("狗");
        a1.cry();
    }
}
