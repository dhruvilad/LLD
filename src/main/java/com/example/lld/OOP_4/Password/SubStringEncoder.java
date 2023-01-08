package com.example.lld.OOP_4.Password;


public class SubStringEncoder extends AbstractPasswordEncoder{

    public SubStringEncoder(String publicKey) {
        super(publicKey);
    }

    @Override
    public String encode(String passowrd) {
        return passowrd.substring(0,2)+getPublicKey();
    }
}
