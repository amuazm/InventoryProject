module com.example.projecttest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projecttest to javafx.fxml;
    exports com.example.projecttest;
    exports com.example.projecttest.controllers;
    opens com.example.projecttest.controllers to javafx.fxml;
}