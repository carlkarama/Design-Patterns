package com.edu.rmit.oosd.wk10.combinationpatterns.camerabuilder.camera.strategy;

public class Pricing {

    private CameraPricingStrategy cameraPricingStrategy;

    public Pricing(CameraPricingStrategy cameraPricingStrategy) {
        this.cameraPricingStrategy = cameraPricingStrategy;
    }

    public void setCameraPricingStrategy(CameraPricingStrategy cameraPricingStrategy) {
        this.cameraPricingStrategy = cameraPricingStrategy;
    }
}
