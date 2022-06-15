package com.example.booking_system_for_gym_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

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
        System.out.println("Enter E-mail");
        String user_email_input = input.next();
        System.out.println("Enter password:");
        String user_password_input = input.next();
    }
    @FXML
    public void signUpButton (ActionEvent event) {
        System.out.println("Enter E-mail");
        String create_user_email = input.next();
        System.out.println("Enter password");
        String create_user_password = input.next();
    }
}