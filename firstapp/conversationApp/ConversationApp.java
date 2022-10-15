package com.springapps.firstapp.conversationApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
@SpringBootApplication
public class ConversationApp implements CommandLineRunner {
@Autowired
Conversation conversation;
    public void run(String... args) throws Exception {
   Conversation conversation = new Conversation(new Person("john"),new Person("Mary"));
   conversation.start();
    }

    public static void main(String[] args) {

    }

}
