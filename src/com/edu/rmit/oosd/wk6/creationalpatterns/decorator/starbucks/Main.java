package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.starbucks;

import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.starbucks.uml.ChaiLatte;

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
