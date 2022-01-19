package com.chen.practice.structuralPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * JDK动态代理只能对实现了接口的类生成代理
 */
public class ProxyFactoryByJDK {

    private Object target;

    public ProxyFactoryByJDK(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("pre");
                        Object returnValue = method.invoke(target,args);
                        System.out.println("post");
                        return returnValue;
                    }
                });
    }
}
