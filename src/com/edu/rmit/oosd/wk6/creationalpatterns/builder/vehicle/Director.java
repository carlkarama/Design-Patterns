package com.edu.rmit.oosd.wk6.creationalpatterns.builder.vehicle;

public class Director {

    private BuilderInterface myBuilder;

    public void construct(BuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
