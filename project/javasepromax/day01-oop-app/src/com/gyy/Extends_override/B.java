package com.gyy.Extends_override;

public class B extends A {
    // 方法重写
    @Override // 安全,可读性好
    public void print1() {
        System.out.println("666");
    }

    // 申明不变,重新实现

    // 方法重写
    @Override
    public void print2(int a, int b) {
        System.out.println("666666");
    }
}
