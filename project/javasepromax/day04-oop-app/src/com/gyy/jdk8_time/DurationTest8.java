package com.gyy.jdk8_time;

import java.time.*;

public class DurationTest8 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025, 11, 11, 11, 10, 10);
        LocalDateTime end = LocalDateTime.of(2025, 11, 11, 11, 11, 11);

        LocalTime s = LocalTime.of(11, 12, 13, 14);
        LocalTime e = LocalTime.of(12, 13, 14, 15);

        Instant instant_s = Instant.now();
        Instant instant_e = Instant.parse("2024-09-23T00:00:00Z");

        System.out.println(instant_s);

        ZonedDateTime s1 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime e1 = ZonedDateTime.now(ZoneId.of("America/New_York"));

        // 1、得到Duration对象
        Duration duration = Duration.between(instant_s, instant_e);

        // 2、获取两个时间对象间隔的信息
        System.out.println(duration.toDays());      // 间隔多少天
        System.out.println(duration.toHours());     // 间隔多少小时
        System.out.println(duration.toMinutes());   // 间隔多少分钟
        System.out.println(duration.toSeconds());   // 间隔多少秒
        System.out.println(duration.toMillis());    // 间隔多少毫秒
        System.out.println(duration.toNanos());     // 间隔多少纳秒
    }
}
