package com.chen.practice.behavioralPattern.observer;

/**
 * 具体目标角色
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("目标发生改变");
        for(Observer observer : observers){
            observer.response();
        }
    }
}
