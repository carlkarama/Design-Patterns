package com.edu.rmit.oosd.wk2.solid.LiskovSubstitutionPrinciple.CarPrinter;

public class Car extends Vehicle {

    public Car(String model, int manufacturingYear) {
        super(model, manufacturingYear);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
