package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        ComboBox<String> comboBox = new ComboBox();
        comboBox.getItems().addAll("España", "Francia", "Alemania");
        comboBox.setValue("Pais");

        Button button1 = new Button("Mostrar Seleccion");

        Label label = new Label();

        button1.setOnAction(e -> {
            String valor = comboBox.getValue();
            label.setText("Has seleccionado: " + valor);
        });
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(comboBox, button1, label);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Lista Desplegable");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
