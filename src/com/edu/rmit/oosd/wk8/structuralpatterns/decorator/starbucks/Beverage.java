package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.starbucks;

public abstract class Beverage {

    public String description = "Thanks for ordering";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
