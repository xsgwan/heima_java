package com.gyy.polimorphism_1;

public class Student extends People {
    public String name = "子类Student的名称";

    @Override
    public void run() {
        System.out.println("学生跑的很快");
    }

    public void test() {
        System.out.println("学生需要考试");
    }
}
