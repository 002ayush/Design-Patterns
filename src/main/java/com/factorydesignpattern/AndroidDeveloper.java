package com.factorydesignpattern;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("My salary is "+200000);
        return 20000;
    }

    @Override
    public void name() {
        System.out.println("My name is Android Developer");
    }
}
