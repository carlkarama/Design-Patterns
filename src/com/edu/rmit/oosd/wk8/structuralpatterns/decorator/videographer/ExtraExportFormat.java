package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.videographer;

public class ExtraExportFormat extends Decorator {

    public ExtraExportFormat(Service service) {
        this.service = service;
    }

    @Override
    public String getDescription() {
        return this.service.getDescription() + "\n-- Extra Export Format ";
    }

    @Override
    public double cost() {
        return this.service.cost() + 150.00;
    }
}
