package com.edu.rmit.oosd.wk9.behaviouralpatterns.visitor.shoppingcart;

public class Main {

    public static void main(String[] args) {

        ItemElement[] itemElements = new ItemElement[] {
                new Book(10, "XTF::01029-KLP"),
                new Fruit(2,1,"Apples"),
                new Fruit(4, 6, "Bananas")};

        int total = calculatePrice(itemElements);

        System.out.println("Total: " + total);
    }

    private static int calculatePrice(ItemElement[] itemElements) {

        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImp();

        int sum = 0;

        for (ItemElement itemElement : itemElements) {
            sum += itemElement.accept(shoppingCartVisitor);
        }
        return sum;
    }
}
