package com.gyy.polymorphism;

public class Student extends People {
    public String name = "子类Student的名称";
    @Override
    public void run() {
        System.out.println("学生跑的很快");
    }
}
