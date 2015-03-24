package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/* Created by earthshine0 on 3/15/2015
 * Scene 1: Base scene, used for selecting Game types
 * Scene 2: Player vs Player standard game
 * Scene 3: Goes to Player vs CPU options (Easy, Normal, Hard)
 * Scene 4: Not sure if separate scene or not, basically Player vs CPU
 */
public class Main extends Application {

    protected Stage window;
    protected Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene = new Scene(root, 300,375);
        scene.getStylesheets().add(getClass().getResource("styleScene1.css").toExternalForm());
        
        window.setTitle("Tic Tac Toe");
        window.setScene(scene);
        //window.setResizable(false);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
