package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField field = new TextField();
        field.setPromptText("Introduce tu nombre:");
        TextField field2 = new TextField();
        field2.setPromptText("Introduce tu tu Correo Electronico:");
        TextField field3 = new TextField();
        field3.setPromptText("Introduce tu Contraseña:");
        Button button = new Button();
        button.setText("Ingresar");
        button.setOnAction(e -> {
            if (field.getText().isEmpty() || field2.getText().isEmpty() || field3.getText().isEmpty()) {
                System.out.println("Error: Todos los campos deben estar llenos.");
            } else {
                System.out.println("Registro exitoso para: " + field.getText());
            }
        });
        VBox vbox = new VBox(field,field2,field3, button);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setTitle("Ejemplo de comboBox de JavaFX.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
