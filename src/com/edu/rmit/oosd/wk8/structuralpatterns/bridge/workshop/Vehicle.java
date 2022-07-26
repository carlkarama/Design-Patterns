package com.edu.rmit.oosd.wk8.structuralpatterns.bridge.workshop;

public abstract class Vehicle {

    protected Workshop workshop1;
    protected Workshop workshop2;

    protected Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract void manufacture();
}
