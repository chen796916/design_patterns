package com.chen.practice.behavioralPattern.mediator;

/**
 * 抽象中介者角色
 */
public interface Mediator {
    void reply(Colleague colleague);

    void register(Colleague colleague);
}
