package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.starbucks;

/**
 * @author Carl Karama
 * @implSpec Extend decorator to allow condiments to be added to a beverage
 * @version 1.0
 */
public abstract class Decorator extends Beverage {

    protected Beverage beverage;

    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0.0;
    }
}
