package com.edu.rmit.oosd.wk9.behaviouralpatterns.state.tv;

public class On extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am switched off now!");
        context.setRemoteControlState(new Off());
    }
}
