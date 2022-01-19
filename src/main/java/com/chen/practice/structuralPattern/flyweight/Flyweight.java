package com.chen.practice.structuralPattern.flyweight;

/**
 * 抽象享元角色
 */
public interface Flyweight {

    void operation(UnsharedConcreteFlyweight outState);
}
