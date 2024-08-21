package com.iteratordesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //This is the iterator design Pattern, and it provides you the accessibility of  all the objects without changing the underlying implementation.
        List<User> user = new ArrayList<>();
        user.add(new User("Ayush",12000,"ayush@gmail.com"));
        user.add(new User("Ansu",75000,"ansu@gmail.com"));
        user.add(new User("Ambuj",50000,"ambuj@gmail.com"));
        user.add(new User("Khushbu",221000,"khusbu@gmail.com"));
        User getUser = new User();
        MyIterator iter = getUser.getIterator(user);
        while(iter.hasNext()){
            User showUser = (User)iter.next();
            System.out.println(showUser);

        }
    }
}
