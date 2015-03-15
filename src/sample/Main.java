package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        window.setTitle("Tic Tac Toe");
        window.setScene(new Scene(root, 300, 375));
        window.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
