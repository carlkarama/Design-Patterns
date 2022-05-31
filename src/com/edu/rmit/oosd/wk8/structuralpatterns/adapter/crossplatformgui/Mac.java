package com.edu.rmit.oosd.wk8.structuralpatterns.adapter.crossplatformgui;

public class Mac implements MacOS {

    @Override
    public void guiToolkit() {
        System.out.println("I am Mac. We all about Steve Jobs here!");
    }
}
