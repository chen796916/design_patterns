package com.chen.practice.behavioralPattern.iterator;

/**
 * 抽象迭代器角色
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
