package com.chen.practice.creatingPattern.SimpleFactory;

public class ProductB implements Product {
    @Override
    public void show() {
        System.out.println("product B has been created!");
    }
}
