package com.chen.practice.structuralPattern.composite.safe;

import java.util.ArrayList;

/**
 * 树枝构件
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void operation() {
        for(Component component : children){
            component.operation();
        }
    }

    public void add(Component component){
        children.add(component);
    }

    public void remove(Component component){
        children.remove(component);
    }

    public Component getChild(int i){
        return children.get(i);
    }
}
