package com.designpatterns.adapter;

public class UltraWheel {
    private int size;
    public UltraWheel(int size){
        this.size=size;

    }
    public int getWheelSize(){
        return size;
    }//end method

    @Override
    public String toString() {
        return "ULTRA WHEEL"+ "("+ size+ ")inches";
    }
}//end class
