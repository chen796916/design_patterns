package com.chen.practice.structuralPattern.proxy.staticProxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("request");
    }
}
