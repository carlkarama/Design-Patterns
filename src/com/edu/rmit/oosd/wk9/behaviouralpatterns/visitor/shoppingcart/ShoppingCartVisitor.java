package com.edu.rmit.oosd.wk9.behaviouralpatterns.visitor.shoppingcart;

public interface ShoppingCartVisitor {

    public int visit(Book book);

    public int visit(Fruit fruit);
}
