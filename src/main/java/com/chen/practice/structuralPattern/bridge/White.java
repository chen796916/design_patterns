package com.chen.practice.structuralPattern.bridge;

/**
 * 具体实现化角色
 */
public class White implements Color {
    @Override
    public String getColor() {
        return "This is abstractStrategy white ";
    }
}
