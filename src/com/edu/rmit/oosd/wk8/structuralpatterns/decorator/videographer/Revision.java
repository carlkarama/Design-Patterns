package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.videographer;

public class Revision extends Decorator {

    public Revision(Service service) {
        this.service = service;
    }

    @Override
    public String getDescription() {
        return this.service.getDescription() + "\n-- Revision ";
    }

    @Override
    public double cost() {
        return this.service.cost() + 150.00;
    }
}
