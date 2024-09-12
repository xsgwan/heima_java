package com.gyy.interface_demo1;

public class Test {
    public static void main(String[] args) {
        Book b = new Book("张三", 12);
        b.showDetails();
        // b.showShortDetails();
        Electronic electronic = new Electronic("李四", 12);
        electronic.showDetails();
    }
}
