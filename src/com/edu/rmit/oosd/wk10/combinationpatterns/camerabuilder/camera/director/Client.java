package com.edu.rmit.oosd.wk10.combinationpatterns.camerabuilder.camera.director;

import com.edu.rmit.oosd.wk10.combinationpatterns.camerabuilder.camera.builder.AbstractCameraBuilder;

/**
 * @implNote The client is the filmmaker using the service to create pricing strategies
 */
public class Client {

    private String name;
    private AbstractCameraBuilder builder;

    public Client(String name) {
        this.name = name;
    }
}
