package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        Scene scene = new Scene(root, 300,400);
        scene.getStylesheets().add(getClass().getResource("styleScene1.css").toExternalForm());

        //window.getIcons().add(new Image("/sample/TicTacToeIcon6.png"));
        //window.getIcons().add(new Image("/sample/TicTacToeIcon5.png"));
        //window.getIcons().add(new Image("/sample/TicTacToeIcon4.png"));
        window.getIcons().add(new Image("/sample/TicTacToeIcon3.png"));

        window.setTitle("Tic Tac Toe");
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
