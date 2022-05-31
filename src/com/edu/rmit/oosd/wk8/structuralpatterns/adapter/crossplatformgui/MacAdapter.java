package com.edu.rmit.oosd.wk8.structuralpatterns.adapter.crossplatformgui;

public class MacAdapter implements LinuxOS {

    private MacOS mac;

    public MacAdapter(MacOS mac) {
        this.mac = mac;
    }

    @Override
    public void guiToolkit() {
        System.out.println("I am a Linux toolkit btw...");
    }
}
