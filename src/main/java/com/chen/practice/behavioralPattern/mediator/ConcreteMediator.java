package com.chen.practice.behavioralPattern.mediator;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {
    private ArrayList<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void reply(Colleague colleague) {
        for(Colleague colleague1 : colleagues){
            if(!colleague.equals(colleague1)){
                colleague1.receive();
            }
        }
    }

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleague.setMediator(this);
            colleagues.add(colleague);
        }
    }
}
