package com.prototypedesignpattern;

public class Test {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Network networkConnection = new Network();
        networkConnection.setIpAddress("192.168.28.10");
        networkConnection.loadHeavyData();
        System.out.println(networkConnection);



        //Due to avoidance of loading the date multiple times we will try to clone it so that we will create only the date rather than creating it again and again. This is the concept of the Builder Design Pattern.
        //Cloning it

        Network ntwk2 = (Network) networkConnection.clone();
        networkConnection.domains().remove(0);
        System.out.println(networkConnection);
        System.out.println(ntwk2);
    }
}
