package com.designpatterns.behavioral;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.Touring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoadBikeRange implements Iterable<BikeInterface> {
    private List<BikeInterface> bikes;
    public RoadBikeRange(){
        bikes = new ArrayList<>();
        bikes.add(new Touring(new NarrowWheel(22)));
        bikes.add(new Touring(new NarrowWheel(24)));
        bikes.add(new Touring(new NarrowWheel(26)));
        bikes.add(new Touring(new NarrowWheel(24)));
        bikes.add(new Touring(new NarrowWheel(22)));
    }
    public List<BikeInterface> getRange(){
        return bikes;
    }

    @Override
    public Iterator<BikeInterface> iterator() {
        return bikes.listIterator();
    }
}//end class
