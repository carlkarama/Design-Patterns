package com.edu.rmit.oosd.wk8.structuralpatterns.compositepattern.structure;

import java.util.List;

/**
 * @author Refactor Guru
 * @note The Container (aka composite) is an element that has sub-elements: leaves or other containers.
 * A container doesn’t know the concrete classes of its children. It works with all sub-elements only via the component interface.
 * Upon receiving a request, a container delegates the work to its sub-elements, processes intermediate results and then returns
 * the final result to the client.
 */

public class Composite {

    private List<Component> children;

    public void add(Component component) {
        this.children.add(component);
    }

    public void remove(Component component) {
        this.children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    public void execute() {

    }
}
