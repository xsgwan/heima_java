package com.gyy.generic_interface;

import java.util.ArrayList;
import java.util.Date;

// 泛型接口
public interface Data<T> {
    void add(T t);
    ArrayList<T> getByName(String name);
}
