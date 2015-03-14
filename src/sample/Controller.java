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
    //Buttons can NOT BE STATIC
    @FXML
    protected Button btnTL, btnTM, btnTR;
    @FXML
    protected Button btnML, btnMM, btnMR;
    @FXML
    protected Button btnBL, btnBM, btnBR;
    @FXML
    protected Label lblStatus;



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

        TicTacToe.resetBoard(this);

        btnTL.setOnAction(event -> TicTacToe.genericBtnClick(this,btnTL, 0, 0, lblStatus));
        
        btnTM.setOnAction(event -> TicTacToe.genericBtnClick(this,btnTM, 1, 0, lblStatus));

        btnTR.setOnAction(event -> TicTacToe.genericBtnClick(this,btnTR, 2, 0, lblStatus));

        btnML.setOnAction(event -> TicTacToe.genericBtnClick(this,btnML, 0, 1, lblStatus));

        btnMM.setOnAction(event -> TicTacToe.genericBtnClick(this,btnMM, 1, 1, lblStatus));

        btnMR.setOnAction(event -> TicTacToe.genericBtnClick(this,btnMR, 2, 1, lblStatus));

        btnBL.setOnAction(event -> TicTacToe.genericBtnClick(this,btnBL, 0, 2, lblStatus));

        btnBM.setOnAction(event -> TicTacToe.genericBtnClick(this,btnBM, 1, 2, lblStatus));

        btnBR.setOnAction(event -> TicTacToe.genericBtnClick(this,btnBR, 2, 2, lblStatus));

    }

    protected void resetButtons() {

        String blank = "";
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

