package com.chen.practice.behavioralPattern.iterator;

import java.util.ArrayList;

/**
 * 具体聚合角色
 */
public class ConcreteAggregate implements Aggregate {
    private ArrayList<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
