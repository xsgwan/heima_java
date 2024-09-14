package com.gyy.generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 目标: 认识泛型
        ArrayList list = new ArrayList();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");
        // list.add(new Cat());

        for (int i = 0; i < list.size(); i++) {
//            String e = list.get(i).toString();
            String e = (String) list.get(i); // 类型转换异常
            System.out.println(e);
        }

        System.out.println("---------------------------------------");
        // ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>(); // JDK1.7开始,后面的数据类型可以不声明
        list1.add("Java1");
        list1.add("Java2");
        list1.add("Java3");
        // list1.add(new Cat());

        for (int i = 0; i < list1.size(); i++) {
            String e = list1.get(i);
            System.out.println(e);
        }
    }
}

class Cat {

}