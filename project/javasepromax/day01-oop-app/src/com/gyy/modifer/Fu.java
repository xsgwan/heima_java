package com.gyy.modifer;

public class Fu {
    // 1、private:只能在本类中访问
    private void privateMethod() {
        System.out.println("==private==");
    }

    // 2、缺省:本类,同一个包下的类
    void method() {
        System.out.println("==缺省==");
    }

    // 3、protected:本类,同一个包下的类,任意包下的子类
    protected void protectedMethod() {
        System.out.println("==protected==");
    }

    // 4、public:本类,同一个包下的类,任意包下的子类,任意包下的任意类
    public void publicMethod() {
        System.out.println("==public==");
    }

    // 本类中,四种权限修饰符修饰的成员均可访问
    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}
