package com.chen.practice.behavioralPattern.visitor;

/**
 * 具体元素角色
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "具体元素A的操作";
    }
}
