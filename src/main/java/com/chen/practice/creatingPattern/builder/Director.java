package com.chen.practice.creatingPattern.builder;

/**
 * 建造者模式
 */
public class Director {
    private AbstractBuilder abstractBuilder;

    public Director(AbstractBuilder abstractBuilder){
        this.abstractBuilder = abstractBuilder;
    }

    public Product construct(){
        abstractBuilder.buildPartA();
        abstractBuilder.buildPartB();
        abstractBuilder.buildPartC();
        return abstractBuilder.getResult();
    }
}
