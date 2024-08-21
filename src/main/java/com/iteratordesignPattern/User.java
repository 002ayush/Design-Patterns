package com.iteratordesignPattern;

import java.util.List;

public class User {

    private String name;
    private int salary;
    private String emailId;

    public User() {}

    public User(String name, int salary, String emailId) {
        this.name = name;
        this.salary = salary;
        this.emailId = emailId;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int salary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String emailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", emailId='" + emailId + '\'' +
                '}';
    }
    public MyIterator getIterator(List<User> user){
        return new MyIterator(user);
    }
}
