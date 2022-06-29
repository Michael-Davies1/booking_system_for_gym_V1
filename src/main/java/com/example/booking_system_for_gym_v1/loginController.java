package com.example.booking_system_for_gym_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {
    @FXML
    private Label StatusLBL;

    @FXML
    private TextField passwordtxt;

    @FXML
    private TextField emailstxt;

    public void login (ActionEvent event) {
        if (emailstxt.getText().equals("email") && passwordtxt.getText().equals("password")) {
            StatusLBL.setText("welcome member");
        } else {
            StatusLBL.setText("email address or password is invalid");
        }

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("member-menu.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
