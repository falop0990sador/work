package com.company;

public class Triangle extends Shape {
    private String name1;

    @Override
    public void print() {
        System.out.println(name1 + " триуголник");
    }
}
