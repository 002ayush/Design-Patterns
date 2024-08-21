package com.iteratordesignPattern;

import java.util.List;

public class MyIterator implements ArrayTraversal{

    private List<User> users;
    private int length;
    private int position = 0;
    MyIterator(List<User> users){
        this.users = users;
        this.length = users.size();
    }
    @Override
    public boolean hasNext() {
        return this.length > this.position;
    }

    @Override
    public Object next() {
        User user = this.users.get(position);
        position++;
        return user;
    }
}
