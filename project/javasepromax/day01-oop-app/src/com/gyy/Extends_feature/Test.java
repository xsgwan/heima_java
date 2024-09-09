package com.gyy.Extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目标:掌握继承的两个注意事项事项。
        // 1、Java是单继承的:一个类只能继承一个直接父类;Java中的类不支持多继承，但是支持多层继承。
        // 2、Object类是Java中所有类的祖宗。
        A a = new A();

        B b = new B();
    }
}

class A {
} // extends Object{}

class B extends A {
}

// class C extends B,A{}    不能继承多个父类
class D extends B {
} // 支持多层继承

