package com.gyy.jdk8_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 目标: 掌握JDK8新增的DateTimeFormatter格式化器的用z
 */
public class DateTImeFormatterTest6 {
    public static void main(String[] args) {
        // 1、创建一个日期时间格式化器对象出来
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2、对时间进格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime now1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(now1);

        /*Instant now2 = Instant.now();
        System.out.println(now2);*/

        String rs = formatter.format(now); // 正向格式化
        System.out.println(rs);

        String rs1 = formatter.format(now1); // 正向格式化
        System.out.println(rs1);

        /*String rs2 = formatter.format(now2);
        System.out.println(rs2);*/

        // 3、格式化时间,其实还有一种方案
        String rs3 = now.format(formatter); // 反向格式化
        System.out.println(rs3);

        // 4、解析时间: 解析时间一般使用LocalDateTime提供的解析方法来解析
        String dateStr = "2029年12月12日 12:12:11";
        LocalDateTime ldt = LocalDateTime.parse(dateStr, formatter);
        System.out.println(ldt);
    }
}
