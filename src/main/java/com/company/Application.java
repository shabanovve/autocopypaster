package com.company;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;

public class Application extends AbstractJavaFxApplicationSupport {
    @Value("${ui.title:JavaFX приложение}")//
    private String windowTitle;

    @Override
    public void start(Stage stage) {
        stage.setTitle(windowTitle);
        stage.setScene(new Scene(new HBox()));
        stage.setResizable(true);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launchApp(args);
    }
}
