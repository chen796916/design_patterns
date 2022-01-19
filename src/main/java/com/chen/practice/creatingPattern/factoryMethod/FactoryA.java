package com.chen.practice.creatingPattern.factoryMethod;

public class FactoryA implements AbstractFactory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
