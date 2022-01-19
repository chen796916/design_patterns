package com.chen.practice.behavioralPattern.iterator;

/**
 * 抽象聚合角色
 */
public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
