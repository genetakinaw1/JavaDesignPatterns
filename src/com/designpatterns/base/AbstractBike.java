package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class AbstractBike implements BikeInterface{
    private WheelInterface wheel;
    private BikeColor Color;

    protected AbstractBike(WheelInterface wheel,BikeColor Color){
        this.wheel=wheel;
        this.Color = Color;
    }

    protected AbstractBike(WheelInterface wheel){
        this(wheel,BikeColor.UNPAINTED);
    }

    @Override
    public WheelInterface getWheel() {
        return wheel;
    }

    @Override
    public BikeColor getColor() {
        return Color;
    }

    @Override
    public void paint(BikeColor color) {
        this.Color = color;

    }
    @Override
    public float getPrice() {
        return 900.00f;
    }

    @Override
    public void CleanFrame() {
        System.out.println("cleaning Frame..... ");
    }

    @Override
    public void airTires() {
        System.out.println("Airing up Tires......");
    }

    @Override
    public void testRide() {
        System.out.println("Taking bike out for a test ride.......");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ("+wheel+", "+Color+" , price = $"+getPrice()+")";
    }


}


