package com.chen.practice.behavioralPattern.strategy;

/**
 * 环境类
 */
public class Context {

    private AbstractStrategy abstractStrategy;

    public void setStrategy(AbstractStrategy abstractStrategy){
        this.abstractStrategy = abstractStrategy;
    }

    public AbstractStrategy getStrategy(){
        return abstractStrategy;
    }

    public void strategyMethod(){
        abstractStrategy.strategyMethod();
    }
}
