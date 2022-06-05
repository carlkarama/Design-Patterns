package com.edu.rmit.oosd.wk9.behaviouralpatterns.memento.texteditor;

public class Main {

    public static void main(String[] args) {

            Originator originator = new Originator();

            Caretaker caretaker = new Caretaker();

            originator.setState("👀");

            originator.setState("🔥");

            caretaker.add(originator.saveMemento());

            originator.setState("🥳");
            caretaker.add(originator.saveMemento());

            originator.setState("🤦🏾‍");
            caretaker.add(originator.saveMemento());

            originator.getStateFromMemento(caretaker.get(0));
            System.out.println("Current State: " + originator.getState());
    }
}
