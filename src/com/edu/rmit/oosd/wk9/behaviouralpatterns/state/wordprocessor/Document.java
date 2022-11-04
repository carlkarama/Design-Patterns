package com.edu.rmit.oosd.wk9.behaviouralpatterns.state.wordprocessor;

public class Document {

    private State state;

    public Document(State state) {
        this.state = new Draft();
    }

    public void changeState(State state) {

    }
}
