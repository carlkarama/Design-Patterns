package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.starbucks;

public class WhipCream extends Decorator {

    public WhipCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", Whip Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
