package com.springapps.firstapp.conversationApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Person person1() {
        return new Person("John");
    }

    @Bean
    public Person person2() {
        return new Person("Mary");
    }

    @Bean
    public Conversation conversation(@Qualifier Person person1, Person person2) {
        return new Conversation(person1, person2);
    }
}
