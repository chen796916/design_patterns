package com.chen.practice.behavioralPattern.observer;

/**
 * 具体观察者角色
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应");
    }
}
