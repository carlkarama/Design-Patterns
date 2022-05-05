package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.decorator.concrete.size;


import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.base.Clothes;
import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.decorator.abstraction.AttributeDecorator;

public class Size extends AttributeDecorator {

    public Size(Clothes attribute) {
        this.attribute = attribute;
    }

    @Override
    public double cost() {
        return attribute.cost() + 1.25;
    }
}
