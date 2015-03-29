package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

/*
 * Created by earthshine0 on 3/6/2015.
 */
public class TicTacToe{

    private int [][] board = {{0,0,0},{0,0,0},{0,0,0}};
    private int player = 1;
    private final String p1 = "X";
    private final String p2 = "O";
    public TicTacToeAI GameAI;


    public TicTacToe(int AIOption) {
        if (AIOption == 1) {
            GameAI = new TicTacToeAIEasy(1);
        }
    }

    public int genericBtnClick(Controller2 aController, Button btn, int i, int j, Label lblStatus){
        if (board[i][j]!= 0) return 0;

        if (board[i][j]==0 && player==1) {
            setBoard(i,j);
            btn.setText(p1);
        }else if(board[i][j]==0 && player==2){
            setBoard(i,j);
            btn.setText(p2);
        }


        checkBoard(aController, lblStatus);
        switchPlayer(lblStatus);
        return 1; //move was successful

    }


    private void switchPlayer(Label lblStatus){
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

    private   void setBoard(int x, int y){
        board[x][y] = player;
    }

    //If someone won, then display message and reset board
    private void checkBoard(Controller2 aController, Label lblStatus){
        if (checkBoardDirections()){
            lblStatus.setText("Congrats, player " + player + " has won!");
            resetBoard(aController);
        } else if (checkFullBoard()){
            lblStatus.setText("Tie Game...restarting");
            resetBoard(aController);
        }

    }

    private boolean checkFullBoard() {
        for (int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(board[x][y]==0) return false;
            }
        }

        return true;
    }

    public void resetBoard(Controller2 aController) {
        for (int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                board[x][y]=0;
            }
        }

        aController.resetButtons();
    }


    private boolean checkBoardDirections(){

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

