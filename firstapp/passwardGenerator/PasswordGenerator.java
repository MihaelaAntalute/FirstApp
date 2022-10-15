package com.springapps.firstapp.passwardGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {
    private PasswordAlphabet passwordAlphabet;


    private PasswordEncoder passwordEncoder;
    private static final Random random = new Random();

    public PasswordGenerator(@Qualifier("allCharacters") PasswordAlphabet passwordAlphabet, @Autowired PasswordEncoder passwordEncoder) {
        this.passwordAlphabet = passwordAlphabet;
        this.passwordEncoder = passwordEncoder;

    }


    //o metoda care sa genereze o parola random de un anumit numar de caractere
    public String generatePassword(int length) {
        StringBuilder generatedPass = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            int randomPosition = random.nextInt(passwordAlphabet.getCharacters().length());
            generatedPass.append(passwordAlphabet.getCharacters().charAt(randomPosition));
        }
        return generatedPass.toString();
    }

    public String encode(String password){
        return passwordEncoder.encode(password);
    }


}
