package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.decorator.concrete.color;


import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.base.Clothes;
import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.decorator.abstraction.AttributeDecorator;


public class Color extends AttributeDecorator {

    public Color(Clothes attribute) {
        this.attribute = attribute;
    }

    @Override
    public String getDescription() {
        return attribute.getDescription();
    }

    @Override
    public double cost() {
        return attribute.cost() + .50;
    }
}
