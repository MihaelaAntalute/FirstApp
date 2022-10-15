package com.springapps.firstapp.DIwithBeans;

import com.springapps.firstapp.DIclassic.A;
import com.springapps.firstapp.DIclassic.B;
import com.springapps.firstapp.DIclassic.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiDemo implements CommandLineRunner {
    @Autowired
    private C c;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(c.generateNumber());
    }

    public static void main(String[] args) {
        SpringApplication.run(DiDemo.class, args);
    }
}
