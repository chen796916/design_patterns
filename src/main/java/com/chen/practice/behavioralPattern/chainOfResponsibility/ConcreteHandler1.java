package com.chen.practice.behavioralPattern.chainOfResponsibility;


/**
 * 具体处理者
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if(request.equals("one")){
            System.out.println("具体处理者1处理该请求");
        }else{
            if(getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("没有人处理该请求");
            }
        }
    }
}
