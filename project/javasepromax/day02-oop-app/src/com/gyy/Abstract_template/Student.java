package com.gyy.Abstract_template;

public class Student extends People {
    /*public void write() {
        System.out.println("\t\t\t\t\t《我的爸爸》");
        System.out.println("\t\t我的爸爸好啊,牛逼啊,来看看我的爸爸有多牛");
        System.out.println("我的爸爸特别牛,我开车都不看红绿灯的,下辈子还要做他的儿子");
        System.out.println("有这样的爸爸太好了!");
    }*/
    @Override
    public String writeMain() {
        return "我的爸爸特别牛,我开车都不看红绿灯的,下辈子还要做他的儿子";
    }
}
