package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.starbucks;

public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        espresso = new WhipCream(espresso);
        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);

        System.out.println(espresso.getDescription() + " " + espresso.cost() + "\n");

        Beverage tea = new Tea();
        tea = new WhipCream(tea);
        tea = new Mocha(tea);
        tea = new ChaiLatte(tea);
        tea = new ChaiLatte(tea);

        System.out.println(tea.getDescription() + " " + tea.cost());
    }
}
