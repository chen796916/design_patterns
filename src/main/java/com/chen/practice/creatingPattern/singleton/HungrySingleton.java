package com.chen.practice.creatingPattern.singleton;

/**
 * 饿汉式单例
 * 线程安全
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * private的目的是防止在外部被实例化
     */
    private HungrySingleton(){

    }

    public HungrySingleton getInstance(){
        return instance;
    }
}
