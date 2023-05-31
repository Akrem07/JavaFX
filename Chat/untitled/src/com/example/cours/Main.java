package com.example.cours;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static javafx.beans.binding.Bindings.when;

public class Main extends Application {
    BorderPane bp=new BorderPane ();
    HBox hb=new HBox (10);
    GridPane gp =new GridPane ();
    Label lb =new Label ("Bonjour");
    Label lb_prenom= new Label ("Prenom");
    Label lb_name= new Label ("Nom");
    TextField tf_nom=new TextField ();
    TextField tf_prenom=new TextField ();
    Button bt_s=new Button ("Save");
    Button bt_c=new Button ("Close");





    @Override
    public void start(Stage stage) throws Exception {

        BorderPane.setAlignment (Pos.CENTER);
        bp.setPadding (new Insets (20));
        bp.setTop (lb);
        lb.setPadding (new Insets (20));




        hb.setAlignment (Pos.CENTER_RIGHT);
        hb.setPadding (new Insets (20));
        hb.getChildren ().addAll (bt_s,bt_c);
        bp.setBottom (hb);

        lb_name.setPadding (new Insets (20));
        lb_prenom.setPadding (new Insets (20));
        gp.addRow (0,lb_name,tf_nom);
        gp.addRow (1,lb_prenom,tf_prenom);
        gp.setAlignment (Pos.CENTER);
        bp.setCenter (gp);
        Scene sc=new Scene (bp,400,300);
        stage.setTitle ("MyInterface");
        stage.setScene (sc);
        stage.show ();

    }
    public static void main(String[] args) {
        launch();
    }
}
