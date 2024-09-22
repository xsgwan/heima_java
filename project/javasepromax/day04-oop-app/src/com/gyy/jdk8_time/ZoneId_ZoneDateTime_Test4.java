package com.gyy.jdk8_time;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class ZoneId_ZoneDateTime_Test4 {
    public static void main(String[] args) {
        // 目标:了解时区和带时区的时间。
        // 1、ZoneId的常见方法:
        // public static ZoneId systemDefault(): 获取系统默认的时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);

        // public static Set<String>getAvailableZoneIds(): 获取Java支持的全部时区Id
        System.out.println(ZoneId.getAvailableZoneIds());

        // public static ZoneId of(String zoneId): 把某个时区id封装成ZoneId对象
        ZoneId zoneId1 = ZoneId.of("America/New_York");

        // 2、ZonedDateTime: 带时区的时间
        // public static ZonedDateTime now(ZoneId zone): 获取某个时区的ZonedDateTime对象
        ZonedDateTime now = ZonedDateTime.now(zoneId1);
        System.out.println(now);

        // 世界标准时间
        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);

        // public static ZonedDateTime now(): 获取系统默认时区的ZonedDateTime对象
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);

        /*LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);*/

        // Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId1));
    }
}
