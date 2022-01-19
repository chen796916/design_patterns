package com.chen.practice.behavioralPattern.chainOfResponsibility;

/**
 * 具体处理者
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if(request.equals("two")){
            System.out.println("具体处理者2处理该请求");
        }else{
            if(getNext() != null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没有人处理该请求");
            }
        }
    }
}
