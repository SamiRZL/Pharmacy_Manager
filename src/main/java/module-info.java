module com.example.pharmacy_manager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    requires org.kordamp.ikonli.javafx;
     opens com.example.pharmacy_manager to javafx.fxml;
    exports com.example.pharmacy_manager;
   requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires java.desktop;
    requires jdk.jconsole;
    }
