package com.observerdesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {
        Subject sub = new SubjectImpl();
        Observer obj = new ObserverImpl("Ayush");
        sub.register(obj);
        sub.notification("Java Course Design Pattern");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Press 1 for register");
            System.out.println("Press 2 for deregistration");
            System.out.println("Press 3 for notification");
            System.out.println("Press any number for exit");
            int ch = Integer.parseInt(bf.readLine());
            if (ch == 1){
                String name = bf.readLine();

                Observer nwobs = new ObserverImpl(name);
                sub.register(nwobs);

            } else if (ch == 3) {
                String title = bf.readLine();

                sub.notification(title);
            }else{
                System.out.println("ThankYou");
                break;
            }
        }
    }
}
