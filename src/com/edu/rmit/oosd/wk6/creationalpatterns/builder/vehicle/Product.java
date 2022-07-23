package com.edu.rmit.oosd.wk6.creationalpatterns.builder.vehicle;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\nSceneProduct completed as below");

        for (String part : this.parts) {
            System.out.println(part);
        }
    }
}
