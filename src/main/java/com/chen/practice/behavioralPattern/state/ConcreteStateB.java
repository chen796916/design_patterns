package com.chen.practice.behavioralPattern.state;

/**
 * 具体状态角色
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        System.out.println("具体状态角色B被调用");
        context.setState(new ConcreteStateA());
    }
}
