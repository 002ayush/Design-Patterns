package com.builderdesignpattern;

public class Test {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setName("Ayush").setSalary(200000).setEmailId("ayush@gamil.com").build();
        System.out.println(user);
    }
}
