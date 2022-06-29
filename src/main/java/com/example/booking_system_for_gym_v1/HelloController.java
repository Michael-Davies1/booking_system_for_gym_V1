package com.example.booking_system_for_gym_v1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloController {
    Scanner input = new Scanner(System.in);
    @FXML
    public void staffSignInButton (ActionEvent event) {
        System.out.println("Enter staff E-mail");
        String staff_email_input = input.next();
        System.out.println("Enter password");
        String staff_password_input;
    }
    @FXML
    public void signInButton (ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void signUpButton (ActionEvent event) throws IOException {

    }
}
