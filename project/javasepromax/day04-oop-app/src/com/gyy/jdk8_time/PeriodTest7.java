package com.gyy.jdk8_time;

import java.time.*;

/**
 * 目标: 掌握Period的作用: 计算机两个日期相差的年数，月数、天数
 */
public class PeriodTest7 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2029, 8, 10);
        LocalDate end = LocalDate.of(2029, 12, 5);

        // 1、获得Period对象,封装两个日期对象
        Period period = Period.between(start, end);

        // 2、通过period对象,获取两个日期对象相差的信息
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
