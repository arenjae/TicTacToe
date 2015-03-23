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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
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



        btnNewGame.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("styleScene1.fxml"));
            //VBox root2 = (VBox) loader.load();

            //Scene scene2 = new Scene(root2);
            //Scene scene2 = new Scene(window.getScene().getRoot(),300,375);
            //Scene scene2 = new Scene(root,300,375);//Fix this part!!!
            //scene2.getClass().getResource("scene2.fxml");
            //window.setScene(scene2);
            window.show();
        });

        /*
        btnNewGameCPU.setOnAction(e->{
            Scene scene3 = new Scene(window.getClass().getResource("scene3.fxml"),300,375);
            scene3.getClass().getResource("scene3.fxml");
            window.setScene(scene3);
            window.show();
        });*/

    }
}
