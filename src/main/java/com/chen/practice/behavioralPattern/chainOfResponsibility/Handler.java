package com.chen.practice.behavioralPattern.chainOfResponsibility;

/**
 * 抽象处理者
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler handler){
        this.next = handler;
    }

    public Handler getNext(){
        return next;
    }

    public abstract void handleRequest(String request);
}
