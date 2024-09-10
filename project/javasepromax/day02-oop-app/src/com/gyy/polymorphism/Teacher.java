package com.gyy.polymorphism;

public class Teacher extends People {
    public String name = "子类Teacher的名称";
    @Override
    public void run() {
        System.out.println("老师跑的较慢");
    }

    public void run1(){
        System.out.println("1");
    }
}
