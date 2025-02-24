package org.example;
import javafx.application.Application; // Required to launch JavaFX application

import javafx.scene.Scene;             // Represents the scene (content area) of the stage

import javafx.scene.layout.Pane;       // A layout node for arranging children in a scene

import javafx.stage.Stage;
// Represents the main window (stage)



public class Main extends Application {


    @Override

    public void start(Stage primaryStage) {

        // Set up the root layout

        Pane root = new Pane();


        // Create a scene with the root layout and specify dimensions

        Scene scene = new Scene(root, 600, 400);


        // Set up the stage (main window)

        primaryStage.setTitle("JavaFX Window"); // Set the title of the window

        primaryStage.setScene(scene);          // Attach the scene to the stage

        primaryStage.show();                   // Display the stage

    }


    public static void main(String[] args) {

        launch(args); // Launch the JavaFX application


    }
}


