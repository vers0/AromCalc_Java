package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.event.ActionEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Arom Calculator");
        primaryStage.setScene(new Scene(root, 530, 520));
        primaryStage.setResizable(false);
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        //primaryStage.initStyle(StageStyle.UNDECORATED); //убрать верхнее меню и кнопки закрыть, свернуть
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }

}
