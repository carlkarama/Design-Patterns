package com.edu.rmit.oosd.wk8.structuralpatterns.adapter.turkeyduck;

public class Main {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The duck says...");
        testDuck(mallardDuck);

        System.out.println("The turkey adapter says...");
        testDuck(turkeyAdapter);

    }

    public static void testDuck(Duck duck) {
        duck.quack();;
        duck.fly();
    }

}
