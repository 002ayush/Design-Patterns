package com.observerdesignpattern;

public class ObserverImpl implements Observer{
    String name;
    ObserverImpl(String name){
        this.name = name;
    }
    @Override
    public  void getnotification(String title){
        System.out.println("Hello "+this.name + " new video of " + title + " has been uploaded");
    }
}
