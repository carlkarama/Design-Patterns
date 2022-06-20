package com.edu.rmit.oosd.wk6.creationalpatterns.builder.vehicle;

public interface BuilderInterface {

    public void buildBody();

    public void insertWheels();

    public void addHeadlights();

    public Product getVehicle();
}
