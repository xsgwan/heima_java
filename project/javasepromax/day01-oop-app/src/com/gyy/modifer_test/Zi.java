package com.gyy.modifer_test;

import com.gyy.modifer.Fu;

public class Zi extends Fu {
    public void test() {
        // private、缺省 修饰的成员,不可在任意包下的子类中访问
        // 在任意包下的子类:        在任意包下定义类继承此类
        // privateMethod();

        // method();

        // protected、public修饰的成员,可以在任意包下的子类中访问
        protectedMethod();
        publicMethod();
    }
}
