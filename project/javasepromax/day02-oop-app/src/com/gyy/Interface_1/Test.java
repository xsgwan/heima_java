package com.gyy.Interface_1;

public class Test {
    public static void main(String[] args) {
        // 目标:搞清楚使用接口的好处
        Driver s = new A();
        s.driver();

        Driver d = new B();
        d.driver();
    }
}

class B implements Driver {

    @Override
    public void driver() {

    }
}

class A extends Student implements Driver, Singer {

    @Override
    public void driver() {
        System.out.println("我会开车");
    }

    @Override
    public void sing() {
        System.out.println("我会唱歌");
    }
}

class Student {

}

interface Driver {
    void driver();
}

interface Singer {
    void sing();
}