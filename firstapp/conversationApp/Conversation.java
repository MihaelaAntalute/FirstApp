package com.springapps.firstapp.conversationApp;

public class Conversation {
    private Person one;
    private Person two;

    public Conversation(Person one, Person two) {
        this.one = one;
        this.two = two;
    }
    public void start(){
        System.out.println(one.sayHello());
        System.out.println(two.sayHello());
    }

}
