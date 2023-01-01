package com.example.pharmacy_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.*;
import javax.swing.SwingUtilities;

import static com.example.pharmacy_manager.PageLogin.jobAccount;
import static javax.swing.JFrame.*;


public class PageLoginController implements Initializable {


    @FXML
    private Label errorLabel = new Label();

    @FXML
    private Label usernameLab = new Label("Username");

    @FXML
    private TextField edtUsername = new TextField();

    @FXML
    private Label passwordLab = new Label("Password");
    @FXML
    private TextField edtPassword = new TextField();

    @FXML
    private Button loginBtn = new Button("Login");


    //ISMAIL HNA ZID kemel DECLARI LES VIEWS LI TES7A9HOM,
    //.
    //.
    //.
    //.
    //.






    @FXML
    public void loginBtn(ActionEvent actionEvent) {
        if (PageLogin.login(edtUsername.getText(), edtPassword.getText())) {
            DISPOSE_ON_CLOSE;
            PageDashboard  dbPage = new PageDashboard();
            dbPage.setVisible(true);
            if (jobAccount == "vendor") {

            }
        } else {
            errorLabel.setText("Username or password entered is wrong");
            edtUsername.setText(" ");
            edtPassword.setText(" ");
        }

    }
}
