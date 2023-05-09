package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.videographer;

public abstract class Service {

    public String description = "\nExtra Items\n";
    
    public abstract double cost();

    public String getDescription() {
        return this.description;
    }
}
