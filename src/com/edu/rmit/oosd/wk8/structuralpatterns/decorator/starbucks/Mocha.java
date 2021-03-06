package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.starbucks;

public class Mocha extends Decorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
