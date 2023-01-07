package com.example.lld.OOP_4.Password;

import org.junit.jupiter.api.Test;

public class PasswordEncoderTest {

    @Test
    public void testPasswordencoder(){
       // new PasswordEncoder(); not allowed as it is interface

        PasswordEncoder encoder=new ReverseEncoder();
        String password=encoder.encode("password");
        System.out.println(password);


    }
}
