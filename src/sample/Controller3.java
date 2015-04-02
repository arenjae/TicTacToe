package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller3 {
    @FXML
    private Button btnEasy;

    @FXML
    private Button btnNormal;

    @FXML
    private Button btnHard;

    protected Stage window;
    protected Scene scene2;

    @FXML
    void initialize(){
        assert btnNormal != null : "fx:id=\"btnNormal\" was not injected: check your FXML file 'scene3.fxml'.";
        assert btnHard != null : "fx:id=\"btnHard\" was not injected: check your FXML file 'scene3.fxml'.";
        assert btnEasy != null : "fx:id=\"btnEasy\" was not injected: check your FXML file 'scene3.fxml'.";

        btnEasy.setOnAction(e->openScene2(1));

        btnNormal.setOnAction(e->openScene2(2));

        btnHard.setOnAction(e->openScene2(3));


    }

    void openScene2(int option) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
            Controller2 testController = new Controller2();
            testController.setAiOption(option);
            loader.setController(testController);
            window = (Stage) btnEasy.getScene().getWindow();
            scene2 = new Scene((Parent) loader.load());
            scene2.getStylesheets().add(getClass().getResource("styleScene2.css").toExternalForm());
            window.setScene(scene2);
        } catch (Exception ignored){}

    }

}