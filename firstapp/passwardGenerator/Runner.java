package com.springapps.firstapp.passwardGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    public Runner(@Autowired PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }


    private  PasswordGenerator passwordGenerator;


    @Override
    public void run(String... args) throws Exception {
        String generatedPassword = passwordGenerator.generatePassword(5);
        System.out.println(generatedPassword);
        System.out.println(passwordGenerator.encode(generatedPassword));
    }
}
