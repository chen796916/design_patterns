package com.chen.practice.creatingPattern.prototype;

/**
 * 浅拷贝
 * 利用实现cloneable接口的clone（）方法来实现浅拷贝
 */
public class ShallowCopy implements Cloneable{

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (ShallowCopy)super.clone();
    }
}
