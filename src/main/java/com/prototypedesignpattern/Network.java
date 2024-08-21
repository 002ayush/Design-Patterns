package com.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Network implements Cloneable {
    private String ipAddress;
    private String data;
    private List<String> domains;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //By default it will be shallow Copy
        //But we will try to create the deep Copy.

        Network ntwk = new Network();
        ntwk.setData(this.data);
        ntwk.setIpAddress(this.ipAddress);

        for(String d : this.domains){
            ntwk.domains().add(d);
        }

        return ntwk;
    }
    public void loadHeavyData() throws InterruptedException {
        this.setData("Most time taken Data to be used over here.");
        this.domains.add("www.google.com");
        this.domains.add("www.w3school.org");
        this.domains.add("www.geeksforgeeks.com");
        Thread.sleep(6000);
    }



    public Network(){
        this.domains = new ArrayList<>();




    }

    public List<String> domains() {
        return domains;
    }



    public String ipAddress() {
        return ipAddress;
    }

    public String data() {
        return data;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }


    @Override
    public String toString() {
        return "Network{" +
                "ipAddress='" + ipAddress + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

}
