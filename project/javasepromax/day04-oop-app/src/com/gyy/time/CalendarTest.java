package com.gyy.time;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        // 目标: 掌握Calendar的使用和特点
        // 1、得到系统此刻时间对应的日历对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 2、获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);

        int month = now.get(Calendar.MONTH) + 1;
        System.out.println(month);

        int days = now.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        // 3、拿到日历中记录的日期对象
        Date d = now.getTime(); // 获取日期对象
        System.out.println(d);
        long time = d.getTime(); // 获取1970年至此日期对象的时间毫秒值
        System.out.println(time);

        // 4、拿到时间毫秒值
        long time2 = now.getTimeInMillis();
        System.out.println(time2); // 与now.getTime().getTime()相同

        // 5、修改日历中的某个信息
        now.set(Calendar.MONTH, 9); // 修改月份为10月份
        System.out.println(now);
        now.set(Calendar.DAY_OF_YEAR, 125); // 修改成一年中的第125天
        System.out.println(now);

        // 6、为某个信息增加或者减少多少
        now.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println(now);
        now.add(Calendar.DAY_OF_YEAR, -40);
        System.out.println(now);
    }
}
