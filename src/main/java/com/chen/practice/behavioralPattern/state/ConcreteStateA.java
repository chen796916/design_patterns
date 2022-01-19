package com.chen.practice.behavioralPattern.state;

/**
 * 具体状态角色
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("具体状态角色A被调用");
        context.setState(new ConcreteStateB());
    }
}
