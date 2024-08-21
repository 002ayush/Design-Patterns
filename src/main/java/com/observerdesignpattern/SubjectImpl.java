package com.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    List<Observer> allobservers = new ArrayList<>();


    @Override
    public void register(Observer ob) {
        this.allobservers.add(ob);
    }

    @Override
    public void deregister(Observer ob) {
        System.out.println("deregistered");
    }

    @Override
    public void notification(String title) {
        for (Observer ob : allobservers){
            ob.getnotification(title);
        }
    }
}
