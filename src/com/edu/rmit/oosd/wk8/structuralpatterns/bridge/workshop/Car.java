package com.edu.rmit.oosd.wk8.structuralpatterns.bridge.workshop;

public class Car extends Vehicle {

    protected Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.println("Car");
        workshop1.work();
        workshop2.work();
    }
}
