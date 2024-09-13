package com.gyy.Enum;

public enum A {
    // 常量,每个常量都是记住一个枚举类对象的
    X, Y, Z;

    /*public A(){

    }*/

    // 默认使用private修饰构造器
    A(){
    }

    A(String name){
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
