package com.example.lld.OOP_4.Password;

public class ReverseEncoder implements PasswordEncoder{
    @Override
    public String encode(String password) {
        //Reverse the password
        StringBuilder sb=new StringBuilder(password);
        return sb.reverse().toString();
    }
}
