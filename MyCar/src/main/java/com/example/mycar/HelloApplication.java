package com.example.mycar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
   VBox vb1,vb2;
   HBox hb;
   Label lb_email,lb_pwd;
   PasswordField pwd;
   TextField tf_email;
    @Override
    public void start(Stage stage) throws IOException {

        vb1= new VBox();
        vb2=new VBox();
        hb=new HBox();
        lb_email=new Label("Email");
        lb_pwd=new Label("Password");
        tf_email=new TextField("Enter your Email");
        pwd=new PasswordField();
        vb2.getChildren().addAll(lb_email,lb_pwd,tf_email,pwd);

        hb.setSpacing(50);
        hb.getChildren().addAll(vb1,vb2);

        Scene sc=new Scene(hb,700,650);
        stage.setTitle("MyCar");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}