package com.edu.rmit.oosd.wk10.combinationpatterns.camerabuilder.camera.product;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCameraProduct<T> {

    public List<T> products = new ArrayList<>();

    AbstractCameraProduct() {

    }

    public boolean addCameraPart(T part) {
        return this.products.add(part);
    }
}
