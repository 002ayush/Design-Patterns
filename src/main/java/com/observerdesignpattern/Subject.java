package com.observerdesignpattern;

public interface Subject {
    public void register(Observer ob);
    public void deregister(Observer ob);
    public void notification(String title);



}
