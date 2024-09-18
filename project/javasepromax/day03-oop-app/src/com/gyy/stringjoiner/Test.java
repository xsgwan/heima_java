package com.gyy.stringjoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        // 目标: 掌握StringJoiner的使用
        // StringJoiner s = new StringJoiner(", "); // 间隔符!
        StringJoiner s = new StringJoiner(", ", "[", "]");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s); // java1, java2, java3

        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr) {
        // 1、判断arr是否为null
        if (arr == null) {
            return null;
        }
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }
}
