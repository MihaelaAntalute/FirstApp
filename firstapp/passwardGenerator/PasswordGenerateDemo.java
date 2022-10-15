package com.springapps.firstapp.passwardGenerator;

import com.springapps.firstapp.DIwithBeans.DiDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordGenerateDemo {


    public static void main(String[] args) {
        SpringApplication.run(PasswordGenerateDemo.class, args);
    }
}
