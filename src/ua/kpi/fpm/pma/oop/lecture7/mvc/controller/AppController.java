package ua.kpi.fpm.pma.oop.lecture7.mvc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import ua.kpi.fpm.pma.oop.lecture7.mvc.model.AuthenticationModel;
import ua.kpi.fpm.pma.oop.lecture7.mvc.model.HardcodedAuthenticationModel;
import ua.kpi.fpm.pma.oop.lecture7.mvc.model.HospitableAuthenticationModel;
import ua.kpi.fpm.pma.oop.lecture7.mvc.model.UnfriendlyAuthenticationModel;

import java.io.IOException;

public class AppController {
    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private GridPane signInPane;

    @FXML
    private GridPane signOutPane;

    @FXML
    private Label welcomeLabel;

    @FXML
    private Label errorLabel;

    private final AuthenticationModel model = new HardcodedAuthenticationModel();

    @FXML
    protected void onSignInButtonPressed(ActionEvent event) throws IOException {
        String login = loginField.getText();
        String password = passwordField.getText();
        if (model.authenticate(login, password)) {
            errorLabel.setVisible(false);
            welcomeLabel.setText(String.format("Welcome, %s!", login));
            showLogoutScene();
        } else {
            errorLabel.setVisible(true);
            showLoginScene();
        }
    }

    public void onSignOutButtonPressed(ActionEvent event) {
        showLoginScene();
    }

    private void showLogoutScene() {
        signInPane.setVisible(false);
        signOutPane.setVisible(true);
    }

    private void showLoginScene() {
        signInPane.setVisible(true);
        signOutPane.setVisible(false);
    }
}
