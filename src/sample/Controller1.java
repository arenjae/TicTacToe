package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/*
 * Created by earthshine0 on 3/14/2015.
 */
public class Controller1 extends Main {

    @FXML
    private Button btnNewGameCPU;

    @FXML
    private Button btnNewGame;


    @FXML
    void initialize() {
        assert btnNewGameCPU != null : "fx:id=\"btnNewGameCPU\" was not injected: check your FXML file 'scene1.fxml'.";
        assert btnNewGame != null : "fx:id=\"btnNewGame\" was not injected: check your FXML file 'scene1.fxml'.";

        //root = FXMLLoader.load(getClass().getResource("scene2.fxml"));

        btnNewGame.setOnAction(e -> {
            Scene scene2 = new Scene(root,300,375);
            scene2.getClass().getResource("scene2.fxml");
            window.setScene(scene2);
            window.show();
        });

    }
}
