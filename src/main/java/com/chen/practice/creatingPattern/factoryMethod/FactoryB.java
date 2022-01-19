package com.chen.practice.creatingPattern.factoryMethod;

public class FactoryB implements AbstractFactory {
    @Override
    public Product create() {
        return new ProductB();
    }
}
