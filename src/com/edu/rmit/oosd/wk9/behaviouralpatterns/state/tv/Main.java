package com.edu.rmit.oosd.wk9.behaviouralpatterns.state.tv;

public class Main {

    public static void main(String[] args) {

        Off initialState = new Off();

        TV tv = new TV(initialState);

        //Turn the tv on
        tv.pressButton();

        //Turn the tv off
        tv.pressButton();
    }
}
