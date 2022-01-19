package com.chen.practice.structuralPattern.decorator;

/**
 * 具体构建角色
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent(){
        System.out.println("具体构建角色被创建");
    }

    @Override
    public void operation() {
        System.out.println("原来的功能");
    }
}
