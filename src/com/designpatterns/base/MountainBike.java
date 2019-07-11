package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class MountainBike extends AbstractBike{
    protected MountainBike(WheelInterface wheel, BikeColor Color){
        super(wheel,Color);
    }

    protected MountainBike(WheelInterface wheel){

        this(wheel,BikeColor.CHROME);
    }

    @Override
    public float getPrice() {
        return 780.00f;
    }
}
