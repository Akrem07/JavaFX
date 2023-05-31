module com.example.mycar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mycar to javafx.fxml;
    exports com.example.mycar;
}