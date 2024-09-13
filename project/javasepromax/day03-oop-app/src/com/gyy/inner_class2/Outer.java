package com.gyy.inner_class2;

public class Outer {
    private int age;
    public static String schoolName;

    // 静态内部类
    public static class Inner {
        private String name;
        public static int a;

        public void test() {
            System.out.println(schoolName);
            // System.out.println(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void test2() {
        System.out.println(schoolName); // 属于类
        // System.out.println(age); // age是对象的成员变量
    }
}
