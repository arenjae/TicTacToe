package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/* Created by earthshine0 on 3/15/2015
 * Scene 1: Base scene, used for selecting Game types
 * Scene 2: Player vs Player standard game
 * Scene 3: Goes to Player vs CPU options (Easy, Normal, Hard)
 * Scene 4: Not sure if separate scene or not, basically Player vs CPU
 */
public class Main extends Application {

    Stage window;

    Parent root;
    //BorderPane root;
    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        
        window.setTitle("Tic Tac Toe");
        window.setScene(new Scene(root, 300, 375));
        window.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
