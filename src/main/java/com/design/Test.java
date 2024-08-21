package com.design;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        /*Samosa samosa = Samosa.getObject();
        System.out.println(samosa.hashCode());
        Samosa samosa1 = Samosa.getObject();
        System.out.println(samosa1.hashCode());
        System.out.println((samosa == samosa1));*/

        //Reflection API - I can break the singleton object
        /*Samosa samosa1 = Samosa.getObject();
        System.out.println(samosa1.hashCode());

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();

        constructor.setAccessible(true);
        Samosa samosa2 = constructor.newInstance();
        System.out.println(samosa2.hashCode());*/
        Samosa samosa1 = Samosa.getObject();
        System.out.println(samosa1.hashCode());

        //Serilization can also be done to break the singleton object

        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(samosa1);

        System.out.println("Serilization done");
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("abc.txt"));
        Samosa samosa2 = (Samosa) ios.readObject();
        System.out.println(samosa2.hashCode());
        */

        //By Cloning also we can break singleton design Pattern
        Samosa clone = (Samosa)samosa1.clone();
        System.out.println(clone.hashCode());
    }
}
