module com.example.projecttest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projecttest to javafx.fxml;
    exports com.example.projecttest;
    exports com.example.projecttest.controllers;
    exports com.example.projecttest.models;
    opens com.example.projecttest.controllers to javafx.fxml;
}