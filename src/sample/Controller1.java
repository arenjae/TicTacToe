package sample;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


/*
 * Created by earthshine0 on 3/14/2015.
 */
public class Controller1{

    @FXML
    private Button btnNewGameCPU;

    @FXML
    private Button btnNewGame;

    protected Stage window;
    protected Parent root;
    protected Parent root2;

    @FXML
    void initialize() throws Exception{
        assert btnNewGameCPU != null : "fx:id=\"btnNewGameCPU\" was not injected: check your FXML file 'scene1.fxml'.";
        assert btnNewGame != null : "fx:id=\"btnNewGame\" was not injected: check your FXML file 'scene1.fxml'.";


        root = FXMLLoader.load(getClass().getResource("scene2.fxml"));


        btnNewGame.setOnAction(e -> {
            window = (Stage) btnNewGame.getScene().getWindow();
            Scene scene2 = new Scene(root);
            scene2.getStylesheets().add(getClass().getResource("styleScene2.css").toExternalForm());
            window.setScene(scene2);
        });

        root2 = FXMLLoader.load(getClass().getResource("scene3.fxml"));

        btnNewGameCPU.setOnAction(e->{
            window = (Stage) btnNewGameCPU.getScene().getWindow();
            Scene scene3 = new Scene(root2);
            scene3.getStylesheets().add(getClass().getResource("styleScene3.css").toExternalForm());
            window.setScene(scene3);
        });

    }
}
