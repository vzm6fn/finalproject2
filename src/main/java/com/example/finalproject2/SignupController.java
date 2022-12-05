package com.example.finalproject2;


import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class SignupController {

    @FXML
    private Button submit;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField confirmPasswordTextField;

    @FXML
    private Label errorLabel;

    @FXML
    protected void onSubmit() throws IOException {
        errorLabel.setText(nameTextField.getText());
    }


}
