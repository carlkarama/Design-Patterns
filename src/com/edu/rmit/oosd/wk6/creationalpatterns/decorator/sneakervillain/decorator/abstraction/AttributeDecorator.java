package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.decorator.abstraction;

import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.base.Clothes;

/**
 * @author Carl Karama
 * @apiNote Uses the decorator pattern to add attributes to a product and go in detail to customise the prices of each attribute
 * @implSpec
 */

public abstract class AttributeDecorator extends Clothes {

    protected Clothes attribute;

    public String getDescription() {
        return attribute.getDescription();
    }

    @Override
    public abstract double cost();
}
