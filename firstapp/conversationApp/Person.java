package com.springapps.firstapp.conversationApp;

public class Person {


    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String sayHello(){
        return "Hello,my name is "+ this.name;
    }
}
