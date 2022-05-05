package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.base;

public abstract class Clothes {

    protected String description = "unknown attribute";


    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0.0;
    }
}
