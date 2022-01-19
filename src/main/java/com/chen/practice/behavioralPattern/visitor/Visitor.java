package com.chen.practice.behavioralPattern.visitor;

/**
 * 抽象访问者角色
 */
public interface Visitor {
    void visit(ConcreteElementA concreteElementA);

    void visit(ConcreteElementB concreteElementB);
}
