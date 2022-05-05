package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.concrete;

import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.base.Clothes;

public class Shoe extends Clothes {

    public Shoe() {
        this.description = "Shoe";
    }

    @Override
    public double cost() {
        return 10.00;
    }
}
