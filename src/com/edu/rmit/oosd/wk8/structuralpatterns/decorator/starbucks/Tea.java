package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.starbucks;

public class Tea extends Beverage {

    public Tea() {
        description = "Tea";
    }

    @Override
    public double cost() {
        return 3.50;
    }
}
