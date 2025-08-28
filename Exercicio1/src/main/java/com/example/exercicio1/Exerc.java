package com.example.exercicio1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exerc extends Application {

    private Label lblNome, lblMsg;
    private TextField txt;
    private Button btnOla, btnSair;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){

        lblNome = new Label("Digite seu nome: ");
        txt = new TextField();
        lblMsg = new Label();
        btnOla = new Button("Olá");
        btnSair = new Button("Sair");

        btnOla.setOnAction(e->{
           String nome = txt.getText();
           lblMsg.setText("Olá, "+nome);
        });

        btnSair.setOnAction(e->{
            Platform.exit();
        });

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));

        vbox.getChildren().addAll(lblNome,txt,lblMsg,btnOla,btnSair);
        Scene scene = new Scene(vbox, 350, 180);
        stage.setScene(scene);
        stage.setTitle("Exercício 1");
        stage.show();
    }
}
