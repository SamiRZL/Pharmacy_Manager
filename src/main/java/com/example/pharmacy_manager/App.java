package com.example.pharmacy_manager;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/FXML/Page1.fxml")));
        Scene scene = new Scene(root);
        stage.setTitle("PHARMMA");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        PageAccounts acc = new PageAccounts();
        acc.setVisible(true);


        launch();
    }
}