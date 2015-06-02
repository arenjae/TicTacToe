package sample;

import javafx.animation.PauseTransition;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/*
 * Created by earthshine0 on 3/6/2015.
 */
public class TicTacToe{

    protected int [][] board = {{0,0,0},{0,0,0},{0,0,0}};
    protected int player = 1;
    protected final String p1 = "X";
    protected final String p2 = "O";
    protected Controller2 aController;

    public TicTacToe() {
    }

    public void setController(Controller2 controller2){aController = controller2;}

    public int genericBtnClick(int i, int j){
        if (board[i][j]!= 0) return 0;

        if (board[i][j]==0 && player==1) {
            setBoard(i,j);
            aController.setBtnText(i,j,p1);
        }else if(board[i][j]==0 && player==2){
            setBoard(i,j);
            aController.setBtnText(i,j,p2);
        }

        checkBoard();
        switchPlayer();

        return 1; //move was successful
    }


    protected void switchPlayer(){
        switch (player){
            case 1:
                player = 2;
                break;
            case 2:
                player = 1;
                break;
        }

        aController.setLblText("Player " + player + "'s turn");
    }

    protected void setBoard(int x, int y){
        board[x][y] = player;
    }

    //If someone won, then display message and reset board
    protected void checkBoard(){
        if (checkBoardDirections(board)){
            showOverlay("Player " + player + " has won!");
            resetBoard();
        } else if (checkFullBoard()){
            showOverlay("Tie Game");
            resetBoard();
        }

    }

    /* Simple function that displays an overlay of the current game board
     * and asks the user if they want to play again or if they want
     * to go back to main menu.
     */
    private void showOverlay(String strMessage) {
        aController.createOverlay(strMessage);

    }

    protected boolean checkFullBoard() {
        for (int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(board[x][y]==0) return false;
            }
        }

        return true;
    }


    public void resetBoard() {
        for (int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                board[x][y]=0;
            }
        }

        aController.resetButtons();
        aController.setLblText("Player " + player + "'s move");
    }

    protected boolean checkBoardDirections(int [][]testBoard){

        //Check columns
        for (int x=0;x<3;x++) {
            if (testBoard[x][0]!=0 && testBoard[x][0] == testBoard[x][1] && testBoard[x][1] == testBoard[x][2])
                return true;
        }

        //Check rows
        for (int y=0;y<3;y++) {
            if (testBoard[0][y]!=0 && testBoard[0][y] == testBoard[1][y] && testBoard[1][y] == testBoard[2][y])
                return true;
        }

        //Diagonal right
        if (testBoard[0][0]!=0 && testBoard[0][0] == testBoard[1][1] && testBoard[1][1] == testBoard[2][2]){
            return true;
        }

        //Diagonal Left
        if (testBoard[0][2]!=0 && testBoard[0][2] == testBoard[1][1] && testBoard[1][1] == testBoard[2][0]) {
            return true;
        }

        return false;
    }


}

