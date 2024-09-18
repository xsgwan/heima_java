package com.gyy.stringbuilder;

public class Test {
    public static void main(String[] args) {
        // 目标: 搞清楚StringBuilder的用法和作用
        // StringBuilder s = new StringBuilder();
        StringBuilder s = new StringBuilder("itheima");

        // 1、拼接内容
        s.append(12);
        s.append("黑马");
        s.append(true);

        // 支持链式编程
        s.append(666).append("黑马2").append(666);
        System.out.println(s);

        // 2、反转操作
        s.reverse();
        System.out.println(s);


        // 3、返回字符串的长度
        System.out.println(s.length());

        // 4、把StringBuilder对象又转换成string类型
        String rs = s.toString();
        System.out.println(rs);
    }
}
