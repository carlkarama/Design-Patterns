package com.edu.rmit.oosd.wk6.creationalpatterns.builder.camerabuilder.camera.builder;

import com.edu.rmit.oosd.wk6.creationalpatterns.builder.camerabuilder.camera.product.AbstractCameraProduct;
import com.edu.rmit.oosd.wk6.creationalpatterns.builder.camerabuilder.camera.product.CameraProduct;

public class ArriCameraBuilderImpl extends AbstractCameraBuilder<ArriCameraBuilderImpl> {

    AbstractCameraProduct<ArriCameraBuilderImpl> product = new CameraProduct();
    @Override
    public ArriCameraBuilderImpl cost() {
        /**
         * TODO - Create strategy pattern to insert as argument to compute best pricing
         */
        return super.cost();
    }

    @Override
    public AbstractCameraProduct getProduct() {
        return product;
    }
}
