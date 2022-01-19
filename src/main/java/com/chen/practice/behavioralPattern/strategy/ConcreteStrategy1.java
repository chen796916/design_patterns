package com.chen.practice.behavioralPattern.strategy;

/**
 * 具体策略类
 */
public class ConcreteStrategy1 implements AbstractStrategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略类1被访问");
    }
}
