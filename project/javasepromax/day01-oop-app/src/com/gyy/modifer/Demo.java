package com.gyy.modifer;

import java.text.DateFormat;

public class Demo {
    public static void main(String[] args) {
        // 目标:掌握不同权限修饰符的作用
        Fu f = new Fu();
        // private修饰的成员,不能在同一个包下的其他类型中访问
        // f.privateMethod;

        // 缺省、protected、public修饰的成员,在同一个包下的其他类型中可以访问
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
