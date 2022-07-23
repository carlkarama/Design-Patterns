package com.edu.rmit.oosd.wk6.creationalpatterns.builder.screenplayscene;

import java.util.LinkedList;

public class SceneProduct extends AbstractProduct {

    private final LinkedList<String> sceneElements;

    public SceneProduct() {
        sceneElements = new LinkedList<>();
    }

    public void add(String element) {
        sceneElements.add(element);
    }

    @Override
    public void display() {
        for (String element : this.sceneElements) {
            System.out.println(element.toString());
        }
    }
}
