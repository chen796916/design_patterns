package com.chen.practice.behavioralPattern.visitor;

/**
 * 具体元素角色
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "具体元素B操作";
    }
}
