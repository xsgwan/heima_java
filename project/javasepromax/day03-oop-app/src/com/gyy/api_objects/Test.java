package com.gyy.api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // 目标: 掌握Objects类提供的常用方法
        String s1 = null;
        String s2 = "itheima";

        // System.out.println(s1.equals(s2)); // s1 = null; 对象为空,调用方法,会报空指针异常,NullPointerException
        System.out.println(Objects.equals(s1, s2)); // 更安全


        System.out.println(Objects.isNull(s1)); // true
        System.out.println(s1 == null); // true
        System.out.println(Objects.isNull(s2)); // false
        System.out.println(s2 == null); // false

        System.out.println(Objects.nonNull(s2)); // true
        System.out.println(Objects.nonNull(s1)); // false

    }
}
