package com.chen.practice.structuralPattern.composite.safe;

/**
 * 树叶构件
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶节点" + name + "被访问");
    }
}
