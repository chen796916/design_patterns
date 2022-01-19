package com.chen.practice.behavioralPattern.mediator;

/**
 * 抽象同事类角色
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
