package com.springapps.firstapp.beans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Addresses {

    @Bean
    public String address(){
        return "str.REpublicii,102";
    }

    @Override
    public String toString() {
        return "Addresses{}";
    }
    @Bean
    public String address2(){
        return "str.Primaverii,34";
    }
}
