package com.chen.practice.behavioralPattern.observer;

import java.util.ArrayList;

/**
 * 抽象目标角色
 */
public abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
