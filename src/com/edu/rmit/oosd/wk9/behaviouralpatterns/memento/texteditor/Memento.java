package com.edu.rmit.oosd.wk9.behaviouralpatterns.memento.texteditor;

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
