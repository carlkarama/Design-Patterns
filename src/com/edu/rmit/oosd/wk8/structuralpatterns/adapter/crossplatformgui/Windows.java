package com.edu.rmit.oosd.wk8.structuralpatterns.adapter.crossplatformgui;

public class Windows implements WindowsOS {

    @Override
    public void guiToolkit() {
        System.out.println("We windows baby!");
    }
}
