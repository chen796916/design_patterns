package com.chen.practice.behavioralPattern.visitor;

/**
 * 抽象元素角色
 */
public interface Element {
    void accept(Visitor visitor);
}
