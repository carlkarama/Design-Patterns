package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.starbucks;

import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.starbucks.Beverage;
import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.starbucks.Decorator;

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
