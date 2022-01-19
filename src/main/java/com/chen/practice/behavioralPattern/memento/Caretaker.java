package com.chen.practice.behavioralPattern.memento;

/**
 * 管理者角色
 */
public class Caretaker {
    private Memento memento;

    public Caretaker(Memento memento){
        this.memento = memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }
}
