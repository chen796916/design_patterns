package com.chen.practice.structuralPattern.proxy.staticProxy;

public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest(){
        System.out.println("preRequest");
    }

    private void postRequest(){
        System.out.println("postRequest");
    }
}
