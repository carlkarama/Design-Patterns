package com.edu.rmit.oosd.wk8.structuralpatterns.adapter.crossplatformgui;

public class Linux implements LinuxOS {

    @Override
    public void guiToolkit() {
        System.out.println("Linux here! Finally a real operating system");
    }
}
