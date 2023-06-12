package com.edu.rmit.oosd.wk6.creationalpatterns.builder.camerabuilder.camera.builder;

import com.edu.rmit.oosd.wk6.creationalpatterns.builder.camerabuilder.camera.product.AbstractCameraProduct;

public abstract class AbstractCameraBuilder<T> implements ItemBuilder<T> {

    @Override
    public T cost() {
        return null;
    }

    public AbstractCameraProduct getProduct() {
        return null;
    }
}
