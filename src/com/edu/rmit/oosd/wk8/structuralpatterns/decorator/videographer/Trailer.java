package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.videographer;

public class Trailer extends Decorator {

    public Trailer(Service service) {
        this.service = service;
    }

    @Override
    public String getDescription() {
        return this.service.getDescription() + "\n-- Trailer ";
    }

    @Override
    public double cost() {
        return this.service.cost() + 200.00;
    }
}
