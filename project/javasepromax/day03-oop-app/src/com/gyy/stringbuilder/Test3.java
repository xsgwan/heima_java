package com.gyy.stringbuilder;

public class Test3 {
    public static void main(String[] args) {
        // 目标: 完成遍历数组内容,并拼接成指定格式的案例
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr) {
        //1、判断arr是否为null
        if (arr == null) {      // 不能用arr.length == 0 进行判断, arr为null,调用length会报空指针异常错误
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(i == arr.length - 1 ? "]" : ", ");
        }
        String rs = sb.toString();
        return rs;
    }
}
