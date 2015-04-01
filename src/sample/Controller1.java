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

    @FXML
    void initialize() throws Exception{
        assert btnNewGameCPU != null : "fx:id=\"btnNewGameCPU\" was not injected: check your FXML file 'scene1.fxml'.";
        assert btnNewGame != null : "fx:id=\"btnNewGame\" was not injected: check your FXML file 'scene1.fxml'.";

        btnNewGame.setOnAction(e -> {
            try {
                FXMLLoader root = new FXMLLoader(getClass().getResource("scene2.fxml"));
                window = (Stage) btnNewGame.getScene().getWindow();
                Scene scene2 = new Scene((Parent) root.load());
                Controller2 testController = root.getController();
                testController.setAiOption(0);
                scene2.getStylesheets().add(getClass().getResource("styleScene2.css").toExternalForm());
                window.setScene(scene2);
            } catch (Exception ignored){

            }
        });



        btnNewGameCPU.setOnAction(e->{
            try {
                FXMLLoader root = new FXMLLoader(getClass().getResource("scene3.fxml"));
                window = (Stage) btnNewGameCPU.getScene().getWindow();
                Scene scene3 = new Scene((Parent) root.load());
                Controller2 testController = root.getController();
                testController.setAiOption(0);
                scene3.getStylesheets().add(getClass().getResource("styleScene3.css").toExternalForm());
                window.setScene(scene3);
            } catch (Exception ignored){

            }

        });

    }
}
