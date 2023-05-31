module com.example.medplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires javafx.media;


    opens com.example.medplayer to javafx.fxml;
    exports com.example.medplayer;
}