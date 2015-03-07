package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    //All nine buttons for tic tac toe
    @FXML
    private static Button btnTL, btnTM, btnTR;
    @FXML
    private static Button btnML, btnMM, btnMR;
    @FXML
    private static Button btnBL, btnBM, btnBR;
    @FXML
    private static Label lblStatus;

    private static String blank = "";


    @FXML
    void initialize() {
        assert btnML != null : "fx:id=\"btnML\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnTR != null : "fx:id=\"btnTR\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnMM != null : "fx:id=\"btnMM\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnBR != null : "fx:id=\"btnBR\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnMR != null : "fx:id=\"btnMR\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnBM != null : "fx:id=\"btnBM\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnBL != null : "fx:id=\"btnBL\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnTM != null : "fx:id=\"btnTM\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnTL != null : "fx:id=\"btnTL\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblStatus != null : "fx:id\"lblStatus\" was not injected: check your FXML file 'sample.fxml'.";

        TicTacToe.resetBoard();

        btnTL.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnTL, 0, 0, lblStatus);
            }
        });
        
        btnTM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnTM, 1, 0, lblStatus);
            }
        });

        btnTR.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnTR, 2, 0, lblStatus);
            }
        });

        btnML.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnML, 0, 1, lblStatus);
            }
        });

        btnMM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnMM, 1, 1, lblStatus);
            }
        });

        btnMR.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnMR, 2, 1, lblStatus);
            }
        });

        btnBL.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnBL, 0, 2, lblStatus);
            }
        });

        btnBM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnBM, 1, 2, lblStatus);
            }
        });

        btnBR.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TicTacToe.genericBtnClick(btnBR, 2, 2, lblStatus);
            }
        });
    }

    protected static void resetButtons() {

        lblStatus.setText(blank);
        btnTL.setText(blank);
        btnTM.setText(blank);
        btnTR.setText(blank);
        btnML.setText(blank);
        btnMM.setText(blank);
        btnMR.setText(blank);
        btnBL.setText(blank);
        btnBM.setText(blank);
        btnBR.setText(blank);
    }

}

