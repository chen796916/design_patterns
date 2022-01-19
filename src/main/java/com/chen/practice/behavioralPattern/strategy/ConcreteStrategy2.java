package com.chen.practice.behavioralPattern.strategy;

/**
 * 具体策略类
 */
public class ConcreteStrategy2 implements AbstractStrategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略类2被访问");
    }
}
