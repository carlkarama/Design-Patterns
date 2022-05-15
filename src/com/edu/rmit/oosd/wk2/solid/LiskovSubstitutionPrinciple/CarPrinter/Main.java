package com.edu.rmit.oosd.wk2.solid.LiskovSubstitutionPrinciple.CarPrinter;

/**
 * @author Carl Karama
 * @apiNote Prints Car details leveraging Liskov's Substitution Principle
 */
public class Main {

    public static void main(String[] args) {

        Vehicle honda = new Car("Honda Civic", 2001);

        Vehicle mercedes = new Car("S-Class", 2012);

        Vehicle bugatti = new Car("Volkswagen Series", 2006);

        Vehicle[] vehicles = {honda, mercedes, bugatti};

        printCars(vehicles);
    }

    public static void printCars(Vehicle[]  vehicles) {

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
