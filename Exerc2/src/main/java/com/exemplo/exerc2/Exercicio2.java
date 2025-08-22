package com.exemplo.exerc2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.Region;
public class Exercicio2 extends Application {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("HBox define os n�s horizontalmente");

        BorderPane bp = new BorderPane();

        btn1 = new Button("1� Bot�o");
        btn2 = new Button("2� Bot�o");
        btn3 = new Button("3� Bot�o");
        btn4 = new Button("4� Bot�o");
        btn5 = new Button("5� Bot�o");

        Region spacer = new Region();


        BorderPane.setAlignment(btn1, Pos.TOP_CENTER);
        BorderPane.setAlignment(btn2, Pos.BASELINE_LEFT);
        BorderPane.setAlignment(btn3, Pos.BASELINE_RIGHT);
        BorderPane.setAlignment(btn4, Pos.CENTER);
        BorderPane.setAlignment(btn5, Pos.BOTTOM_CENTER);

        bp.setTop(btn1);
        bp.setLeft(btn2);
        bp.setRight(btn3);
        bp.setCenter(btn4);
        bp.setBottom(btn5);

        bp.setPadding(new Insets(10));


        Scene scene = new Scene(bp, 300, 200);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}