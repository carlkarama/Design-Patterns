package com.edu.rmit.oosd.wk9.behaviouralpatterns.visitor.shoppingcart;

public class ShoppingCartVisitorImp implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {

        int cost = 0;

        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }

        System.out.println("ISBN: " + book.getISBN() + "\n" +
                           "Price " + book.getPrice());

        return cost;
    }

    @Override
    public int visit(Fruit fruit) {

        int cost  = fruit.getPricePerKg() * fruit.getWeight();

        System.out.println(fruit.getName() + " cost = " + cost);

        return cost;
    }
}
