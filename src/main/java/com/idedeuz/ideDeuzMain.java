package com.idedeuz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ideDeuzMain extends Application {
    double x, y = 0;
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ideDeuz.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("editorTexto.css");
        stage.setScene(scene);
        stage.setTitle("DEUZ IDE: Minion");
        stage.getIcons().add(new Image("file:src/main/resources/com/images/minion.png"));
        stage.initStyle(StageStyle.UNDECORATED);
        root.setOnMousePressed( evt -> {
            x = evt.getSceneX();
            y = evt.getSceneY();
        });
        root.setOnMouseDragged(evt ->{
            stage.setX(evt.getScreenX() - x);
            stage.setY(evt.getScreenY() - y);
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}