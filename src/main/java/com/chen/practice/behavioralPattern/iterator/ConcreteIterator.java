package com.chen.practice.behavioralPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体迭代器角色
 */
public class ConcreteIterator implements Iterator {
    private List list;
    private int index = -1;

    public ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if(hasNext()){
            obj = list.get(index + 1);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(index < list.size() - 1){
            return true;
        }else{
            return false;
        }
    }
}
