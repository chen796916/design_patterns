package com.chen.practice.creatingPattern.SimpleFactory;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

    public static Product createProduct(int flag){
        switch (flag){
            case Const.PRODUCT_A:
                return new ProductA();
            case Const.PRODUCT_B:
                return new ProductB();
            default:
        }
        return null;
    }
}
