package com.edu.rmit.oosd.wk9.behaviouralpatterns.state.tv;

public class TV {

    private RemoteControl remoteControlState;

    public TV(RemoteControl remoteControlState) {
        this.remoteControlState = remoteControlState;
    }

    public RemoteControl getRemoteControlState() {
        return remoteControlState;
    }

    public void setRemoteControlState(RemoteControl remoteControlState) {
        this.remoteControlState = remoteControlState;
    }

    public void pressButton() {
        remoteControlState.pressSwitch(this);
    }
}
