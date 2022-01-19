package com.chen.practice.structuralPattern.bridge;

/**
 * 拓展抽象化角色
 */
public class Wallet extends Bag {
    @Override
    String getName() {
        return color.getColor() + "bag";
    }
}
