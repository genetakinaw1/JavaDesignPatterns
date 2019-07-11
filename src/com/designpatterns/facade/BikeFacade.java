package com.designpatterns.facade;

import com.designpatterns.base.BikeInterface;

public class BikeFacade {
    public void PrepareForSale(BikeInterface bike){
        Registration reg = new Registration(bike);
        reg.allocatingBikeNumber();
        Documentation.printBrochure();
        bike.airTires();
        bike.CleanFrame();
        bike.testRide();
    }
}