package com.edu.rmit.oosd.wk6.creationalpatterns.builder.screenplayscene;

public class SceneHeading implements SceneHeadingBuilder {

    private int sceneHeadingID;
    private final SceneHeadingProduct sceneHeadingProduct = new SceneHeadingProduct();

    public SceneHeading(int sceneHeadingID) {
        this.sceneHeadingID = sceneHeadingID;
    }

    public int getSceneHeadingID() {
        return sceneHeadingID;
    }

    public void setSceneHeadingID(int sceneHeadingID) {
        this.sceneHeadingID = sceneHeadingID;
    }

    @Override
    public SceneHeading buildSceneHeadingSetting(Setting setting) {
        sceneHeadingProduct.addToSceneHeading(Setting.valueOf(setting.name()).toString().toUpperCase());
        return this;
    }

    @Override
    public SceneHeading buildSceneHeadingLocation(Location location) {
        sceneHeadingProduct.addToSceneHeading(location.getLocation().toUpperCase());
        return this;
    }

    @Override
    public SceneHeading buildSceneHeadingProperty(Property property) {
        sceneHeadingProduct.addToSceneHeading(Property.valueOf(property.name()).toString());
        return this;
    }

    @Override
    public SceneHeading buildSceneHeadingLocationModifier(Place place) {
        sceneHeadingProduct.addToSceneHeading(place.getPlace());
        return this;
    }

    @Override
    public SceneHeading buildSceneHeadingEstablishment(Establishment establishment) {
        sceneHeadingProduct.addToSceneHeading(Establishment.valueOf(establishment.name()).toString());
        return this;
    }

    @Override
    public SceneHeading buildSceneTime(SceneHeadingTime scenetime) {
        sceneHeadingProduct.addToSceneHeading(SceneHeadingTime.valueOf(scenetime.name()).toString().toUpperCase());
        return this;
    }

    @Override
    public SceneHeading buildSceneTimeModifier(SceneHeadingTimeModifier sceneHeadingTimeModifier) {
        sceneHeadingProduct.addToSceneHeading(SceneHeadingTimeModifier.valueOf(sceneHeadingTimeModifier.name()).toString().toUpperCase());
        return this;
    }

    @Override
    public SceneHeading buildSceneTimePeriod(TimePeriod timePeriod) {
        sceneHeadingProduct.addToSceneHeading(Integer.toString(timePeriod.getPeriod()));
        return this;
    }

    @Override
    public SceneHeading buildSceneHeadingLocality(Locality locality) {
        sceneHeadingProduct.addToSceneHeading(locality.getLocality());
        return this;
    }

    @Override
    public SceneHeading buildSceneHeadingFlashback(Flashback flashback) {
        sceneHeadingProduct.addToSceneHeading(flashback.getFlashback());
        return this;
    }

    @Override
    public SceneHeadingProduct getSceneHeading() {
        return sceneHeadingProduct;
    }

    @Override
    public String toString() {
        return getSceneHeading().toString();
    }
}
