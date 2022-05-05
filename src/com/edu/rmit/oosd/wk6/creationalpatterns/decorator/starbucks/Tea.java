package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.starbucks;

public class Tea extends Beverage {

    public Tea() {
        description = "Tea";
    }

    @Override
    public double cost() {
        return 3.50;
    }
}
