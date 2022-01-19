package com.chen.practice.behavioralPattern.template;

/**
 * 抽象类
 */
abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod(){
        abstractMethod1();
        if(hookMethod1()){
            specificMethod();
        }
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    public void specificMethod(){
        System.out.println("具体方法被调用");
    }

    /**
     * 钩子方法
     * 用于逻辑判断
     */
    public boolean hookMethod1(){
        return false;
    }

    /**
     * 钩子方法
     * 需要子类重写的空方法
     */
    public void hookMethod2(){

    }

    /**
     * 抽象方法
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法
     */
    public abstract void abstractMethod2();
}
