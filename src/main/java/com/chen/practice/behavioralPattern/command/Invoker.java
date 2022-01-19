package com.chen.practice.behavioralPattern.command;

/**
 * 请求者/调用者
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
