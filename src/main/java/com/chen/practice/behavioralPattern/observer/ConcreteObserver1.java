package com.chen.practice.behavioralPattern.observer;

/**
 * 具体观察者角色
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者角色1作出反应");
    }
}
