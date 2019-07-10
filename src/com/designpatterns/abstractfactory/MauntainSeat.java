package com.designpatterns.abstractfactory;

public class MauntainSeat implements BikeSeatInterface {
    @Override
    public String getSeatParts() {
        return "Seat parts for the Mountain Bike";
    }
}
