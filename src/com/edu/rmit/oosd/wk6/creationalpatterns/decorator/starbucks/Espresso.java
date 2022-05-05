package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.starbucks;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso ";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
