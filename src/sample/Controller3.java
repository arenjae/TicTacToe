package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller3 {

    @FXML
    private Button btnNormal;

    @FXML
    private Button btnHard;

    @FXML
    private Button btnEasy;


    protected Stage window;
    protected Parent root;
    protected FXMLLoader root2;
    protected Scene scene2;

    @FXML
    void initialize() throws Exception{
        assert btnNormal != null : "fx:id=\"btnNormal\" was not injected: check your FXML file 'scene3.fxml'.";
        assert btnHard != null : "fx:id=\"btnHard\" was not injected: check your FXML file 'scene3.fxml'.";
        assert btnEasy != null : "fx:id=\"btnEasy\" was not injected: check your FXML file 'scene3.fxml'.";

        btnEasy.setOnAction(e->{
            try {
                root2 = new FXMLLoader(getClass().getResource("scene2.fxml"));
                window = (Stage) btnEasy.getScene().getWindow();
                scene2 = new Scene((Parent) root2.load());
                Controller2 testController = root2.getController();
                testController.setAiOption(1);
                scene2.getStylesheets().add(getClass().getResource("styleScene2.css").toExternalForm());
                window.setScene(scene2);
            } catch (Exception ignored){

            }
        });


        btnNormal.setOnAction(e->{
            try {
                root2 = new FXMLLoader(getClass().getResource("scene2.fxml"));
                window = (Stage) btnEasy.getScene().getWindow();
                scene2 = new Scene((Parent) root2.load());
                Controller2 testController = root2.getController();
                testController.setAiOption(2);
                scene2.getStylesheets().add(getClass().getResource("styleScene2.css").toExternalForm());
                window.setScene(scene2);
            } catch (Exception ignored){

            }
        });

        btnHard.setOnAction(e->{
            try {
                root2 = new FXMLLoader(getClass().getResource("scene2.fxml"));
                window = (Stage) btnEasy.getScene().getWindow();
                scene2 = new Scene((Parent) root2.load());
                Controller2 testController = root2.getController();
                testController.setAiOption(3);
                scene2.getStylesheets().add(getClass().getResource("styleScene2.css").toExternalForm());
                window.setScene(scene2);
            } catch (Exception ignored){

            }
        });


    }

    void openScene2(int option) {

        window.setScene(scene2);
    }

    void openScene2old(int option){
        window = (Stage) btnEasy.getScene().getWindow();
        Scene scene2 = new Scene(root);
        scene2.getStylesheets().add(getClass().getResource("styleScene2.css").toExternalForm());
        window.setScene(scene2);
    }
}