package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class DawnwHill extends MountainBike {

    public DawnwHill(WheelInterface wheel, BikeColor color){
        super(wheel,color);
    }
    public DawnwHill(WheelInterface wheel){

        this(wheel,BikeColor.GREEN);
    }
    @Override
    public float getPrice() {
        return 870.00f;
    }
}
