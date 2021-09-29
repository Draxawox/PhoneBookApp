module com.example.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.scenebuilder to javafx.fxml;
    exports com.example.scenebuilder;
    exports com.example.scenebuilder.datamodel;
    opens com.example.scenebuilder.datamodel to javafx.fxml;
}