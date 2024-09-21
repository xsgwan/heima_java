package com.gyy.jdk8_time;

import java.time.LocalTime;

public class LocalTimeTest2 {
    public static void main(String[] args) {
        // 0、获取本地时间对象
        LocalTime lt = LocalTime.now(); // 时 分 秒 纳秒 不可变的
        System.out.println("当前时间:" + lt);
        System.out.println("-----------------------------------------");

        // 1、获取时间中的信息
        int hour = lt.getHour(); // 时
        int minute = lt.getMinute(); // 分
        int second = lt.getSecond(); // 秒
        int nano = lt.getNano(); // 纳秒

        System.out.println("当前小时:" + hour);
        System.out.println("当前分钟:" + minute);
        System.out.println("当前秒:" + second);
        System.out.println("当前纳秒:" + nano);
        System.out.println("-----------------------------------------");

        // 2、修改时间: withHour、withMinute、withSecond、withNano
        LocalTime lt3 = lt.withHour(10);
        LocalTime lt4 = lt.withMinute(10);
        LocalTime lt5 = lt.withSecond(10);
        LocalTime lt6 = lt.withNano(10);

        System.out.println("10点钟的现在:" + lt3);
        System.out.println("10分钟的现在:" + lt4);
        System.out.println("10秒钟的现在:" + lt5);
        System.out.println("10纳秒的现在:" + lt6);
        System.out.println("-----------------------------------------");

        // 3、加多少: plusHours、plusMinutes、plusSeconds、plusNanos
        LocalTime lt7 = lt.plusHours(10);
        LocalTime lt8 = lt.plusMinutes(10);
        LocalTime lt9 = lt.plusSeconds(10);
        LocalTime lt10 = lt.plusNanos(10);
        System.out.println("10小时后:" + lt7);
        System.out.println("10分钟后:" + lt8);
        System.out.println("10秒钟后:" + lt9);
        System.out.println("10纳秒后:" + lt10);
        System.out.println("-----------------------------------------");

        // 4、减多少: minusHours、minusMinutes、minusSeconds、minusNanos
        LocalTime lt11 = lt.minusHours(10);
        LocalTime lt12 = lt.minusMinutes(10);
        LocalTime lt13 = lt.minusSeconds(10);
        LocalTime lt14 = lt.minusNanos(10);
        System.out.println("10小时前:" + lt11);
        System.out.println("10分钟前:" + lt12);
        System.out.println("10秒钟前:" + lt13);
        System.out.println("10纳秒前:" + lt14);
        System.out.println("-----------------------------------------");

        // 5、获取指定时间的LocalTime对象:
        // public static LocalTime.of(int hour,int minute,int second)
        LocalTime lt15 = LocalTime.of(12, 12, 12);
        LocalTime lt16 = LocalTime.of(12, 12, 12);
        System.out.println("12:12:12:" + lt15);
        System.out.println("12:12:12:" + lt16);
        System.out.println("-----------------------------------------");

        // 6、判断2个时间对象,是否相等,在前还是在后: equals isBefore isAfter
        System.out.println(lt15.equals(lt16));
        System.out.println(lt15.isBefore(lt));
        System.out.println(lt15.isAfter(lt));
    }
}
