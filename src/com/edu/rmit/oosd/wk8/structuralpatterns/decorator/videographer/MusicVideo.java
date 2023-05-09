package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.videographer;

public class MusicVideo extends Service {

    private String title;
    private double budget;

    MusicVideo(String title, double budget) {
        this.title = title;
        this.budget = budget;

        description = "Music Video";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double cost() {
        return this.budget;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
