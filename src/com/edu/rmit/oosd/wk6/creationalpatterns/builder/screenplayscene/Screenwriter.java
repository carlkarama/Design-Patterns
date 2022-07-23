package com.edu.rmit.oosd.wk6.creationalpatterns.builder.screenplayscene;

/**
 * The director specifying to the builder how to construct a scene
 */
public class Screenwriter {

    private int screenwriterID;
    private String firstName;
    private String lastName;
    private SceneBuilderInterface sceneBuilder;

    public void write(SceneBuilderInterface sceneBuilder) {
        this.sceneBuilder = sceneBuilder;
    }

    public Screenwriter(int screenwriterID, String firstName, String lastName) {
        this.screenwriterID = screenwriterID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getScreenwriterID() {
        return screenwriterID;
    }

    public void setScreenwriterID(int screenwriterID) {
        this.screenwriterID = screenwriterID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SceneBuilderInterface getSceneBuilder() {
        return sceneBuilder;
    }

    public void setSceneBuilder(SceneBuilderInterface sceneBuilder) {
        this.sceneBuilder = sceneBuilder;
    }

    @Override
    public String toString() {
        return "Screenwriter{" +
                "screenwriterID=" + screenwriterID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sceneBuilder=" + sceneBuilder +
                '}';
    }
}
