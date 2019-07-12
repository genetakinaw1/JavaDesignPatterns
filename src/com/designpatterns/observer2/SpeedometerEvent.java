package com.designpatterns.observer2;

import java.util.EventObject;

public class SpeedometerEvent extends EventObject {
    private int Speed;
    public SpeedometerEvent(Object obj, int speed){
        super(obj
        );
        this.Speed= speed;
    }

    public int getSpeed() {
        return Speed;
    }
}
