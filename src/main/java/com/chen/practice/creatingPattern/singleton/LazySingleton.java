package com.chen.practice.creatingPattern.singleton;

/**
 * 懒汉式单例
 * 线程不安全，使用volatile和双重检验
 */
public class LazySingleton {

    /**
     * volatile禁止指令重排序
     */
    private static volatile LazySingleton instance = null;

    /**
     * private的目的是防止在外部被实例化
     */
    private LazySingleton(){

    }

    public LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                /**
                 * 若没有第二个判断，在并发下则会导致创建出多个实例
                 */
                if(instance == null){
                    /**
                     * 这条语句为非原子性，实际发生为
                     * ①在堆上分配空间
                     * ②初始化属性
                     * ③引用指向该对象
                     *所以在instance上加volatile禁止指令重排
                     *若没有禁止指令重排，则可能导致②③顺序颠倒，导致返回的instance是一个未初始化的值（即为null）
                     */
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
