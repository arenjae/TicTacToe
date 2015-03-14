package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/*
 * Created by earthshine0 on 3/6/2015.
 */
public class TicTacToe{

    private static int [][] board = {{0,0,0},{0,0,0},{0,0,0}};
    private static int player = 1;
    private static final String p1 = "X";
    private static final String p2 = "O";


    private TicTacToe() {}

    public static void genericBtnClick(Controller aController, Button btn, int i, int j, Label lblStatus){
        if (board[i][j]!= 0) return;

        if (board[i][j]==0 && player==1) {
            setBoard(i,j);
            btn.setText(p1);
        }else if(board[i][j]==0 && player==2){
            setBoard(i,j);
            btn.setText(p2);
        }


        checkBoard(aController, lblStatus);
        switchPlayer(lblStatus);

    }


    private static void switchPlayer(Label lblStatus){
        switch (player){
            case 1:
                player = 2;
                break;
            case 2:
                player = 1;
                break;
        }
        lblStatus.setText("Player " + player + "'s turn");
    }

    private static void setBoard(int x, int y){
        board[x][y] = player;
    }

    //If someone won, then display message and reset board
    private static void checkBoard(Controller aController, Label lblStatus){
        if (checkBoardDirections()){
            lblStatus.setText("Congrats, player " + player + " has won!");
            resetBoard(aController);
        } else if (checkFullBoard()){
            lblStatus.setText("Tie Game...restarting");
            resetBoard(aController);
        }

    }

    private static boolean checkFullBoard() {
        for (int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(board[x][y]==0) return false;
            }
        }

        return true;
    }

    public static void resetBoard(Controller aController) {
        for (int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                board[x][y]=0;
            }
        }

        aController.resetButtons();
    }


    private static boolean checkBoardDirections(){

        //Check columns
        for (int x=0;x<3;x++) {
            if (board[x][0]!=0 && board[x][0] == board[x][1] && board[x][1] == board[x][2])
                return true;
        }

        //Check rows
        for (int y=0;y<3;y++) {
            if (board[0][y]!=0 && board[0][y] == board[1][y] && board[1][y] == board[2][y])
                return true;
        }

        //Diagonal right
        if (board[0][0]!=0 && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return true;
        }

        //Diagonal Left
        if (board[0][2]!=0 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        return false;
    }

}

