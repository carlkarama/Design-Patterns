package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.sneakervillain.decorator.concrete.size;


import com.edu.rmit.oosd.wk8.structuralpatterns.decorator.sneakervillain.component.base.Clothes;
import com.edu.rmit.oosd.wk8.structuralpatterns.decorator.sneakervillain.decorator.abstraction.AttributeDecorator;

public class Size extends AttributeDecorator {

    public Size(Clothes attribute) {
        this.attribute = attribute;
    }

    @Override
    public double cost() {
        return attribute.cost() + 1.25;
    }
}
