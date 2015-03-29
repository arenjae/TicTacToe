package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller2{

    //All nine buttons for tic tac toe
    //Buttons can NOT BE STATIC (They are static??)
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
        assert btnML != null : "fx:id=\"btnML\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnTR != null : "fx:id=\"btnTR\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnMM != null : "fx:id=\"btnMM\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnBR != null : "fx:id=\"btnBR\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnMR != null : "fx:id=\"btnMR\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnBM != null : "fx:id=\"btnBM\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnBL != null : "fx:id=\"btnBL\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnTM != null : "fx:id=\"btnTM\" was not injected: check your FXML file 'scene2.fxml'.";
        assert btnTL != null : "fx:id=\"btnTL\" was not injected: check your FXML file 'scene2.fxml'.";
        assert lblStatus != null : "fx:id\"lblStatus\" was not injected: check your FXML file 'scene2.fxml'.";

        TicTacToe newGame = new TicTacToe(0);

        newGame.resetBoard(this);
        //TicTacToe.resetBoard(this);

        btnTL.setOnAction(event -> newGame.genericBtnClick(this, btnTL, 0, 0, lblStatus));
        
        btnTM.setOnAction(event -> newGame.genericBtnClick(this, btnTM, 1, 0, lblStatus));

        btnTR.setOnAction(event -> newGame.genericBtnClick(this,btnTR, 2, 0, lblStatus));

        btnML.setOnAction(event -> newGame.genericBtnClick(this,btnML, 0, 1, lblStatus));

        btnMM.setOnAction(event -> newGame.genericBtnClick(this,btnMM, 1, 1, lblStatus));

        btnMR.setOnAction(event -> newGame.genericBtnClick(this,btnMR, 2, 1, lblStatus));

        btnBL.setOnAction(event -> newGame.genericBtnClick(this,btnBL, 0, 2, lblStatus));

        btnBM.setOnAction(event -> newGame.genericBtnClick(this,btnBM, 1, 2, lblStatus));

        btnBR.setOnAction(event -> newGame.genericBtnClick(this,btnBR, 2, 2, lblStatus));

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

    protected void changeScenes(){

        /*
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(root, 300, 375));
        primaryStage.show();*/
    }

}

