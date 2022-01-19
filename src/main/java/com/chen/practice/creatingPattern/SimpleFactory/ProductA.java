package com.chen.practice.creatingPattern.SimpleFactory;

public class ProductA implements Product {

    @Override
    public void show() {
        System.out.println("product A has been created!");
    }
}
