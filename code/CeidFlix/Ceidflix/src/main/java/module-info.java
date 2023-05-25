module com.example.ceidflix {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.ceidflix to javafx.fxml;
    exports com.example.ceidflix;
    exports com.example.ceidflix.controllers;
    opens com.example.ceidflix.controllers to javafx.fxml;
    exports com.example.ceidflix.models;
    opens com.example.ceidflix.models to javafx.fxml;
    exports com.example.ceidflix.interfaces to javafx.fxml;
    opens com.example.ceidflix.interfaces;
    exports com.example.ceidflix.functions to javafx.fxml;
    opens com.example.ceidflix.functions;
}