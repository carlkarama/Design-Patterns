package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.starbucks;

/**
 * @see Decorator
 * @implSpec ChaiLatte is a decorator to attach additional condiments to a base order.
 */
public class ChaiLatte extends Decorator {

    public ChaiLatte(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chai Latte";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.00;
    }
}
