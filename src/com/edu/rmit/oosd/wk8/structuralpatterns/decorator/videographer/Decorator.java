package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.videographer;

public abstract class Decorator extends Service {

    protected Service service;

    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
