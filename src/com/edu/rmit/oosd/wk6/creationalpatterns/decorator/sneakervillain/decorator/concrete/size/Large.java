package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.decorator.concrete.size;

import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.base.Clothes;

public class Large extends Size {

    public Large(Clothes attribute) {
        super(attribute);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Large";
    }

    @Override
    public double cost() {
        return super.cost() + 0.50;
    }
}
