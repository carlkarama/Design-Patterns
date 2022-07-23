package com.edu.rmit.oosd.wk6.creationalpatterns.builder.screenplayscene;


public class Main {

    public static void main(String[] args) {

        // Director class
        Screenwriter writer = new Screenwriter(1, "Carl", "Karama");

        // Scene Builder interface
        SceneBuilderInterface sceneOneBuilder = new Scene(1)
                .buildSceneHeading(new SceneHeading(1)
                        .buildSceneHeadingSetting(Setting.EXT)
                        .buildSceneHeadingLocation(new Location(1, "NOLAN'S HOME"))
                        .buildSceneHeadingLocationModifier(new Place(1, "BACKYARD"))
                        .buildSceneTimePeriod(new TimePeriod(1, 1962))
                        .buildSceneTime(SceneHeadingTime.DAY)
                        .buildSceneHeadingFlashback(new Flashback(1, "FLASHBACK"))
                        .buildSceneTimeModifier(SceneHeadingTimeModifier.DUSK))
                .buildActionLine(new ActionLine(1, "Erik begins fidgeting with his fingers"))
                .buildCharacter(new Character(1, "Janson"))
                .buildParenthetical(new Parenthetical(1, "(Starkly looks at Billy)"))
                .buildDialogue(new Dialogue(1, "Billy why don't you go home, it's quite dangerous here at night"))
                .buildCharacter(new Character(2, "Billy"))
                .buildParenthetical(new Parenthetical(2, "(smacks lips)"))
                .buildDialogue(new Dialogue(2, "But I do not wanna go home!"))
                .buildTransition(Transition.FADE_IN);

        // Screenwriter adds first scene
        writer.write(sceneOneBuilder);

        // SceneProduct = [Scene 1]
        AbstractProduct sceneOne = sceneOneBuilder.getScene();
        sceneOne.display();

        SceneBuilderInterface sceneTwoBuilder = new Scene(2)
                .buildTransition(Transition.FADE_IN)
                .buildSceneHeading(new SceneHeading(2)
                        .buildSceneHeadingSetting(Setting.EXT)
                        .buildSceneHeadingLocation(new Location(2, "BILLY'S HOME"))
                        .buildSceneHeadingLocationModifier(new Place(2, "FRONT PORCH"))
                        .buildSceneTime(SceneHeadingTime.NIGHT)
                        .buildSceneTimeModifier(SceneHeadingTimeModifier.DUSK))
                .buildActionLine(new ActionLine(2, "Billy knocks the door hard"))
                .buildCharacter(new Character(2, "Billy"))
                .buildDialogue(new Dialogue(2, "Mum... are you home?"));

        // Screenwriter adds second scene
        writer.write(sceneTwoBuilder);

        // SceneProduct = [Scene 2]
        AbstractProduct sceneTwo = sceneTwoBuilder.getScene();
        sceneTwo.display();

        SceneBuilderInterface[] scenes = {
                sceneOneBuilder,
                sceneTwoBuilder
        };

        int sceneTotal = scenes.length;
        System.out.println("\n" + "Total Number of Scenes: " + sceneTotal);
    }
}
