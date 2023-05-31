package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root =  FXMLLoader.load(getClass().getResource("sample2.fxml"));

        primaryStage.setTitle("Tawla w kressi Client");
        primaryStage.setScene(new Scene(root,333,603));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
