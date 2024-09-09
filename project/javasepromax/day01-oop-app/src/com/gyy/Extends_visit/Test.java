package com.gyy.Extends_visit;

public class Test {
    public static void main(String[] args) {
        // 目标:掌握子类中访问其他成员的特点:就近原则
        Child child = new Child();
        child.showName();
        child.showMethod();
    }
}
