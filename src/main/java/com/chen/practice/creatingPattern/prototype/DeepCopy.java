package com.chen.practice.creatingPattern.prototype;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * 深拷贝
 * 利用序列化成json，再反序列化实现深拷贝
 */
public class DeepCopy implements Serializable {

    private int val1;
    private int val2;

    public DeepCopy(int val1,int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public void setVal1(int val1){
        this.val1 = val1;
    }

    public void setVal2(int val2){
        this.val2 = val2;
    }

    public int getVal1(){
        return val1;
    }

    public int getVal2(){
        return val2;
    }

    @Override
    public String toString(){
        return "val1 = " + val1 + " ; val2 = " + val2;
    }

    public DeepCopy deepCopy(){
        String jsonString = JSON.toJSONString(this);
        return JSONObject.parseObject(jsonString,DeepCopy.class);
    }

}
