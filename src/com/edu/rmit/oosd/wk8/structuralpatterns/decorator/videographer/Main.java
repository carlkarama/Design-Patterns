package com.edu.rmit.oosd.wk8.structuralpatterns.decorator.videographer;

public class Main {

    public static void main(String[] args) {

        Service benjysMusicVideo = new MusicVideo("Banana Love", 1500.00);

        benjysMusicVideo = new Revision(benjysMusicVideo);
        benjysMusicVideo = new ExtraExportFormat(benjysMusicVideo);
        benjysMusicVideo = new Trailer(benjysMusicVideo);


        System.out.println("Music Video Pricing Breakdown");


        System.out.println("Total Cost: " + benjysMusicVideo.cost() + " " + benjysMusicVideo.getDescription());
    }
}
