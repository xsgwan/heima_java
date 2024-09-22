package com.gyy.jdk8_time;

import java.time.Instant;

/**
 * 目标：掌握Instant的使用
 */

public class InstantTest5 {
    public static void main(String[] args) {
        // 1、创建Instant的对象,获取此刻时间信息
        Instant now = Instant.now(); // 不可变对象

        // 2、获取总秒数
        long second = now.getEpochSecond();
        System.out.println(second);

        // 3、不够1秒的纳秒数
        int nano = now.getNano();
        System.out.println(nano);

        System.out.println(now);

        // Instant对象的作用: 做代码的性能分析,或者记录用户的操作时间点
        Instant now1 = Instant.now();
        // 执行代码。。。
        Instant now2 = Instant.now();
    }
}
