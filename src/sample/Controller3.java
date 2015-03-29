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

    @FXML
    void initialize() throws Exception{
        assert btnNormal != null : "fx:id=\"btnNormal\" was not injected: check your FXML file 'scene3.fxml'.";
        assert btnHard != null : "fx:id=\"btnHard\" was not injected: check your FXML file 'scene3.fxml'.";
        assert btnEasy != null : "fx:id=\"btnEasy\" was not injected: check your FXML file 'scene3.fxml'.";

        root = FXMLLoader.load(getClass().getResource("scene2.fxml"));

        btnEasy.setOnAction(e -> openScene2());

        btnNormal.setOnAction(e->openScene2());

        btnHard.setOnAction(e->openScene2());

    }

    void openScene2() {
        window = (Stage) btnEasy.getScene().getWindow();
        Scene scene2 = new Scene(root);
        scene2.getStylesheets().add(getClass().getResource("styleScene2.css").toExternalForm());
        window.setScene(scene2);
    }
}