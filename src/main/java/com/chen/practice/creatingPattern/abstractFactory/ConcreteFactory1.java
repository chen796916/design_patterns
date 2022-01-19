package com.chen.practice.creatingPattern.abstractFactory;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProduct1 createProduct1() {
        return new ConcreteProduct11();
    }

    @Override
    public AbstractProduct2 createProduct2() {
        return new ConcreteProduct21();
    }
}
