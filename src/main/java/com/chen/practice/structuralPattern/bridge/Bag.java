package com.chen.practice.structuralPattern.bridge;

/**
 * 抽象化角色
 */
public abstract class Bag {

    protected Color color;

    public void setColor(Color color){
        this.color = color;
    }

    abstract String getName();
}
