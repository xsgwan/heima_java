package com.gyy.Interface_jdk8;

public interface A {
    /**
     * 1、默认方法: 必须使用default修饰，默认会被public修饰
     * 实例方法: 对象的方法,必须使用实现类的对象访问
     */
    default void test1() {
        System.out.println("==默认方法==");
        test2();
    }

    /**
     * 2、私有方法：必须使用private修饰
     * 实例方法: 对象的方法,必须使用实现类的对象访问
     */
    private void test2() {
        System.out.println("==私有方法==");
    }

    /**
     * 3、类方法(静态方法): 必须使用stat1c修饰
     * 注意: 只能用接口名来调用
     */
    public static void test3() {
        System.out.println("==静态方法==");
    }

    void test4();

    void test5();
}
