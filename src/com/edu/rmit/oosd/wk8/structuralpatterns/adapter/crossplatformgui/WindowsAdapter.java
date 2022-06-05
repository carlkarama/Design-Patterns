package com.edu.rmit.oosd.wk8.structuralpatterns.adapter.crossplatformgui;

public class WindowsAdapter implements MacOS {

    private WindowsOS windows;

    public WindowsAdapter(WindowsOS windows) {
        this.windows = windows;
    }

    @Override
    public void guiToolkit() {
        System.out.println("I am a Mac toolkit btw");
    }
}
