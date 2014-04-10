package ua.kpi.fpm.pma.oop.lecture7.mvc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MVCApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MVCApp.class.getResource("view/view.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("MVC Example");
        primaryStage.setScene(new Scene(root, 350, 200));
        primaryStage.show();
    }

}
