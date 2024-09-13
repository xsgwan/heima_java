package com.gyy.inner_class;

public class Test {
    public static void main(String[] args) {
        // 目标:了解成员内部类和其特点
        // Outer.Inner in = new Outer.Inner();
        Outer.Inner in = new Outer().new Inner();
        in.test();
    }
}
