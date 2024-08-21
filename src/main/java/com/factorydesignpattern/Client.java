package com.factorydesignpattern;

public class Client {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        e1.salary();

    }
}
