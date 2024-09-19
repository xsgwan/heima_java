package com.gyy.time;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // 目标: 掌握Date日期类的使用
        // 1、创建一个Date的对象: 代表系统当前时间信息的
        Date date = new Date();
        System.out.println(date); // Thu Sep 19 17:21:46 CST 2024

        // 2、拿到时间毫秒值
        long time = date.getTime();
        System.out.println(time);

        // 3、把时间毫秒值转换成日期对象: 2S之后的时间是多少
        time += 2 * 1000;
        Date d2 = new Date(time);
        System.out.println(d2);

        // 4、直接把日期对象的时间通过SetTime方法进行修改
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }
}
