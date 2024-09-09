package com.gyy.modifer_test;

import com.gyy.modifer.Fu;

public class Demo2 {
    public static void main(String[] args) {
        Fu f = new Fu();

        // private、缺省、protected 修饰的成员,不可在任意包下的任意类中访问
        // f.privateMethod();

        // f.method();

        // f.protectedMethod();

        // public 修饰的成员,可以在任意包下的任意类中访问
        f.publicMethod();

        Zi zi = new Zi();
        // Demo2不是子类,不能访问
        // zi.protectedMethod();
    }
}
