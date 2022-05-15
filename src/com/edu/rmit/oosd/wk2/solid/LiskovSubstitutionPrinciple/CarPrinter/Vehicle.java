package com.edu.rmit.oosd.wk2.solid.LiskovSubstitutionPrinciple.CarPrinter;

public abstract class Vehicle {

    private String model;
    private int manufacturingYear;

    public Vehicle(String model, int manufacturingYear) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }
}
