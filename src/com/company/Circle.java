package com.company;

public class Circle extends Shape {

    private String name;

    @Override
    public void print() {
        System.out.println(name + " круглый");
    }
}
