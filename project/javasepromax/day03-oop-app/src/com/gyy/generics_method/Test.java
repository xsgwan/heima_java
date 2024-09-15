package com.gyy.generics_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 目标: 掌握泛型方法的定义和使用
        String rs = test("Java");
        System.out.println(rs);

        System.out.println(test(new Dog()));

        // 需求: 所有的汽车可以一起参加比赛
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new BENZ());
        go(cars);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        // dogs不是Car的子类,不能调用go方法
        /*ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        go(dogs);*/
    }

    /*public static <T extends Car> void go(ArrayList<T> cars) {

    }*/

    // ?通配符,在使用泛型的时候可以代表一切类型    ? extends Car(上限)   ? super Car(下限)
    public static void go(ArrayList<? extends Car> cars){

    }

    // 泛型方法
    public static <T> T test(T t) {
        return t;
    }

}
