package com.gyy.generics_class;

public class Test {
    public static void main(String[] args) {
        // 目标: 掌握泛型类的定义和使用
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java1");
        list.add("Java2");
        String ele = list.get(1);
        System.out.println(ele);

        MyClass2<Cat, String> c2 = new MyClass2<>();

        // MyClass3<String> c3 = new MyClass3<>(); // String 没有继承 Animal
        MyClass3<Animal> c3 = new MyClass3<>(); // Animal 本身
        MyClass3<Dog> c4 = new MyClass3<>(); // Dog 是 Animal子类
    }
}
