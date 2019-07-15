package com.designpatterns.visitor;

import com.designpatterns.base.WheelInterface;

public class WheelDiagnostics implements  WheelVisitorInterface{
    @Override
    public void visit(WheelInterface wheel) {
        System.out.println("Diagnosing wheel bearing");
    }

    @Override
    public void visit(Spokes spokes) {
        System.out.println("Diagnosing wheel spokes");
    }

    @Override
    public void visit(Bearings bearings) {
        System.out.println("Diagnosing wheel bearings");
    }
}
