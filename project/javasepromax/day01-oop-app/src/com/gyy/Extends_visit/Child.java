package com.gyy.Extends_visit;

public class Child extends Father {
    // String name = "子类名称";

    public void showName() {
        String name = "局部名称";
        System.out.println(name); // 局部名称
        System.out.println(this.name); // 子类成员变量
        System.out.println(super.name);
    }

    @Override
    public void print1(){
        System.out.println("==子类的print1方法执行了==");
    }

    public void showMethod(){
        print1(); // 父类的
        super.print1();
    }
}
