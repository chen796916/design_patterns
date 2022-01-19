package com.chen.practice.behavioralPattern.state;

/**
 * 环境类角色
 */
public class Context {
    private State state;

    public Context(){
        this.state = new ConcreteStateA();
    }


    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void handle(){
        state.handle(this);
    }
}
