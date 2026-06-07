package com.aquatp.calculator;

import com.aquatp.calculator.userinterface.ButtonHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // To create a new Stage: Stage stage1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        Scene scene = new Scene(root);

        Image icon = new Image("favicon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Calculator");
        stage.setResizable(false);

        new ButtonHandler();

        stage.setScene(scene);
        stage.show();
    }
}
