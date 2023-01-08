package com.example.lld.OOP_4.Password;

import org.junit.jupiter.api.Test;

public class AbstractPasswordEncoderTest {

    @Test
    public void testEncoder(){
//        new AbstractPasswordEncoder(); compile time error

        AbstractPasswordEncoder encoder=new SubStringEncoder("public");
        String encode=encoder.encode("abc");
        String expected="abcpublic";
        System.out.println(encode.equals(expected));
       // assertEquals("If e")

    }

    @Test
    public void testStatic(){
        System.out.println(AbstractPasswordEncoder.KEY_PREFIX);

        AbstractPasswordEncoder encoder1=new SubStringEncoder("public");
       // encoder1.KEY_PREFIX="PUBLIC_01";

        AbstractPasswordEncoder encoder2=new SubStringEncoder("public");
       // encoder2.KEY_PREFIX="PUBLIC_02";

        System.out.println(encoder1.KEY_PREFIX + "  "+encoder2.KEY_PREFIX);

        AbstractPasswordEncoder.printKeyPrefix();
    }


}
