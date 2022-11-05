package com.edu.rmit.oosd.wk8.structuralpatterns.compositepattern.structure;

/**
 * @author Refactor Guru
 * @note The Leaf is a basic element of a tree that doesn’t have sub-elements.
 * Usually, leaf components end up doing most of the real work, since they don’t have anyone to delegate the work to.
 */

public class Leaf implements Component {

    @Override
    public void execute() {
        // do some work
    }
}
