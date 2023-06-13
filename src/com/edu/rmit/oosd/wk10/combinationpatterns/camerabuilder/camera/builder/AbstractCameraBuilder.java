package com.edu.rmit.oosd.wk10.combinationpatterns.camerabuilder.camera.builder;

import com.edu.rmit.oosd.wk10.combinationpatterns.camerabuilder.camera.product.AbstractCameraProduct;

public abstract class AbstractCameraBuilder<T> implements ItemBuilder<T> {

    @Override
    public T cost() {
        return null;
    }

    public AbstractCameraProduct getProduct() {
        return null;
    }
}
