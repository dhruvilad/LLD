package com.example.lld.OOP_4.Password;


import lombok.AllArgsConstructor;

@AllArgsConstructor
//step 1-add abstarct to class declaration
public abstract class AbstractPasswordEncoder {

    //step2=add state
    private String publicKey;
    public static final String KEY_PREFIX="PUBLIC";

    //step3 -add methods with implementation
    public String getPublicKey(){
        return publicKey;
    }

    //step4- declare methods w/o implementation as abstarct
    public abstract String encode(String passowrd);

    public static  void printKeyPrefix(){
        System.out.println(KEY_PREFIX);
    }
}
