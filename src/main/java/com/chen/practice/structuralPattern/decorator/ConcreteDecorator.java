package com.chen.practice.structuralPattern.decorator;

/**
 * 具体装饰角色
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        super.operation();
        addFunction();
    }

    public void addFunction(){
        System.out.println("增加的功能");
    }
}
