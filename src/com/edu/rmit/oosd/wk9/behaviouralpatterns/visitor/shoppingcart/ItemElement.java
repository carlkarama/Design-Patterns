package com.edu.rmit.oosd.wk9.behaviouralpatterns.visitor.shoppingcart;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}
