package com.gyy.api_object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 目标: 掌握object类提供的对象克隆的方法
        // 1、protected Object clone(): 对象克隆
        User u1 = new User(1, "zhangsan",
                "wo666", new double[]{99.0, 99.5});
        User u2 = (User) u1.clone();
        System.out.println(u1.getId());
        System.out.println(u1.getUsername());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScores());


        System.out.println(u2.getId());
        System.out.println(u2.getUsername());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScores());
    }
}
