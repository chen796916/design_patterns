package com.chen.practice.structuralPattern.adapter.classAdapter;

/**
 * 类适配者模式
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void target() {
        doSomething();
    }
}
