package com.chen.practice.structuralPattern.adapter.objectAdapter;

/**
 * 对象适配者模式
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void target() {
        adaptee.doSomething();
    }
}
