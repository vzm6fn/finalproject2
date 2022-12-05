package com.example.finalproject2;

import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    public void switchScreen(String file) throws IOException {
        // Switching scene credit: https://gist.github.com/pethaniakshay/302072fda98098a24ce382a361bdf477
        Stage stage = (Stage) loginButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(file));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private Label welcomeText;

    @FXML
    private Button loginButton;

    @FXML
    private Button signupButton;

    @FXML
    protected void onLoginClick() throws IOException {
        welcomeText.setText("Welcome to JavaFX Application!");
        switchScreen("loginScreen.fxml");
    }

    @FXML
    protected void onSignupClick() throws IOException {
        welcomeText.setText("Welcome to JavaFX Application!");
        switchScreen("signupScreen.fxml");
    }
}