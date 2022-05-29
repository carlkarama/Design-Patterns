package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.sneakervillain.decorator.concrete.color;

import com.edu.rmit.oosd.wk8.structuralpatterns.decorator.sneakervillain.component.base.Clothes;

public class Blue extends Color {


    public Blue(Clothes attribute) {
        super(attribute);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +"\n" +  " Blue";
    }

    @Override
    public double cost() {
        return super.cost() + 1.25;
    }
}
