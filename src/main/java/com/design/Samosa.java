package com.design;

import java.io.Serial;
import java.io.Serializable;

public class Samosa implements Serializable,Cloneable {
    private static Samosa samosa;
    private Samosa(){
        /*if (samosa!=null){
            throw new RuntimeException("You are trying to break Singleton object");
        }*/
    }
    
    public static Samosa  getObject(){
        //The method which gives the object is called factory method..
        synchronized (Samosa.class){
            if (samosa == null) {
                samosa = new Samosa();
            }
        }



        //System.out.println(Samosa.class.getName());
        return samosa;
    }
    //Using the readResolve method we can solve this serilization Issue
    @Serial
    public Object readResolve(){
        return  samosa;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        //return super.clone();
        return  samosa;
    }

}

