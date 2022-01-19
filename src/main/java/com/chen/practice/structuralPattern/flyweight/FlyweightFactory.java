package com.chen.practice.structuralPattern.flyweight;

import java.util.HashMap;

/**
 * 享元工厂角色
 */
public class FlyweightFactory {

    private HashMap<String,Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if(flyweight != null){
            System.out.println("具体享元" + key + "已被获取");
        }else{
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key,flyweight);
        }
        return flyweight;
    }
}
