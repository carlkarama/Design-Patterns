package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.sneakervillain.component.concrete;

import com.edu.rmit.oosd.wk8.structuralpatterns.decorator.sneakervillain.component.base.Clothes;

public class Shirt extends Clothes {

    public Shirt() {
        this.description = "Shirt";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
