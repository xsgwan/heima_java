package com.gyy.Extends_constructor;

class Father {
    public Father() {
        System.out.println("===父类Father的 有参数构造器 执行了===");
    }
}

class Child extends Father {
    public Child() {
        // super(); // 默认存在的
        System.out.println("===子类Child的 无参数构造器 执行了===");
    }
    public Child(String name) {
        // super(); // 默认存在的
        System.out.println("===子类Child的 有参数构造器 执行了===");
    }

}

public class Test {
    public static void main(String[] args) {
        // 目标:先认识子类构造器的特点，再掌握这个特点的常见应用场景
        Child child = new Child();
        Child child2 = new Child("播妞");
    }
}
