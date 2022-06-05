package com.edu.rmit.oosd.wk8.structuralpatterns.adapter.crossplatformgui;

public class LinuxAdapter implements WindowsOS {

    private LinuxOS linux;

    public LinuxAdapter(LinuxOS linux) {
        this.linux = linux;
    }

    @Override
    public void guiToolkit() {
        System.out.println("I am a Windows toolkit btw...");
    }
}
