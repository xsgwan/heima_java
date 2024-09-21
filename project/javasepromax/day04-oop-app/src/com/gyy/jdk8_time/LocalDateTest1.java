package com.gyy.jdk8_time;

import java.time.LocalDate;

public class LocalDateTest1 {
    public static void main(String[] args) {
        // 0、获取本地日期对象(不可变对象)
        LocalDate ld = LocalDate.now(); // 年 月 日
        System.out.println(ld);

        // 1、获取日期对象中的信息
        int year = ld.getYear(); // 年
        int month = ld.getMonthValue(); // 月 (1-12)
        int day = ld.getDayOfMonth(); // 日
        int dayOfYear = ld.getDayOfYear(); // 一年中的第几天
        int dayOfWeek = ld.getDayOfWeek().getValue(); // 星期几

        System.out.println(year);
        System.out.println(day);
        System.out.println(dayOfWeek);

        //2、直接修改某个信息: withYear、withMonth、withDayOfMonth、withDayOfYear
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(12);

        System.out.println("2099年的今天:" + ld2);
        System.out.println("12月的今天:" + ld3);
        System.out.println("今天:" + ld);
        System.out.println("------------------------");

        //3、把某个信息加多少: plusYears、plusMonths、plusDays、plusWeeks
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(2);

        System.out.println("两年后:" + ld4);
        System.out.println("两个月后:" + ld5);
        System.out.println("------------------------");

        //4、把某个信息减多少: minusYears、minusMonths、minusDays、minusWeeks
        LocalDate ld6 = ld.minusYears(2);
        LocalDate ld7 = ld.minusMonths(2);
        LocalDate ld10 = ld.minusWeeks(2);

        System.out.println("两年前:" + ld6);
        System.out.println("两个月前:" + ld7);
        System.out.println("两周前:" + ld10);
        System.out.println("------------------------");

        //5、获取指定日期的LocalDate对象: public static LocalDate.of(int year,int month,int dayOfMonth)
        LocalDate ld8 = LocalDate.of(2099, 12, 12);
        LocalDate ld9 = LocalDate.of(2099, 12, 12);

        System.out.println("2099年12月12日:" + ld8);
        System.out.println("2099年12月12日:" + ld9);
        System.out.println("------------------------");

        //6、判断2个日期对象,是否相等,在前还是在后: equals isBefore isAfter
        System.out.println(ld8.equals(ld9)); // true
        System.out.println(ld8.isAfter(ld)); // true
        System.out.println(ld8.isBefore(ld)); // false
    }
}
