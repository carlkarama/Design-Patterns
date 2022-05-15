package com.edu.rmit.oosd.wk2.solid.LiskovSubstitutionPrinciple.CarPrinter;

public class Honda extends Car {

    public Honda(String model, int manufacturingYear) {
        super(model, manufacturingYear);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getManufacturingYear() {
        return super.getManufacturingYear();
    }

    @Override
    public void setManufacturingYear(int manufacturingYear) {
        super.setManufacturingYear(manufacturingYear);
    }
}
