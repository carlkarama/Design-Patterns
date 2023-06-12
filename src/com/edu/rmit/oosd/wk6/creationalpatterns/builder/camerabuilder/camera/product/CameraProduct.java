package com.edu.rmit.oosd.wk6.creationalpatterns.builder.camerabuilder.camera.product;

public class CameraProduct<T> extends AbstractCameraProduct<T> {

    public CameraProduct() {
        super();
    }

    @Override
    public boolean addCameraPart(T part) {
        return super.products.add(part);
    }
}
