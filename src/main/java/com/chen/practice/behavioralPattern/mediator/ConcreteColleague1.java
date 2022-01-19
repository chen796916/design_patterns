package com.chen.practice.behavioralPattern.mediator;

/**
 * 具体同事类角色
 */
public class ConcreteColleague1 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类角色1收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类角色2发送请求");
        mediator.reply(this);
    }
}
