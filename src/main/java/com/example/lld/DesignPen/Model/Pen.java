package com.example.lld.DesignPen.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pen {
    private String brand;
    private String name;
    private PenType type;
    private double price;
    private Refill refill;
    //null check required for ball pen and gel pen as they dont require this
    private Ink ink;
    private Nib nib;

    public void write(){
        //SRP viaolated becuase of this
        switch(type){
            case BALL:
                System.out.println("Ball pen");
                break;
            case GEL:
                System.out.println("gel pen");
                break;
            case FOUNTAIN:
                System.out.println("fountain pain");
                break;
            case MARKER:
                System.out.println("market pen");
                break;
        }
        throw new RuntimeException("");
    }


}
