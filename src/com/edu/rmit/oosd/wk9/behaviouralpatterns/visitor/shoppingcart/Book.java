package com.edu.rmit.oosd.wk9.behaviouralpatterns.visitor.shoppingcart;

public class Book implements ItemElement {

    private int price;
    private String ISBN;

    public Book(int price, String ISBN) {
        this.price = price;
        this.ISBN = ISBN;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
