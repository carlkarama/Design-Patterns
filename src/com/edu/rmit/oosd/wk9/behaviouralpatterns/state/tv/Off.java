package com.edu.rmit.oosd.wk9.behaviouralpatterns.state.tv;

public class Off extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am switched on now!");
        context.setRemoteControlState(new On());
    }
}
