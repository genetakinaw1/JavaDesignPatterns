package com.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {
    public static final int SPEED_ALERT = 30;

    @Override
    public void update(Observable obs, Object arg) {
        Speedometer speedo = (Speedometer) obs;
        if (speedo.getCurrentSpeed() >= SPEED_ALERT) {
            System.out.println("** Alert** Moving to fast!("
                    + speedo.getCurrentSpeed() + ")");
        } else {
            System.out.println("... nice and steady ...("
                    + speedo.getCurrentSpeed() + ")");
        }
    }
}