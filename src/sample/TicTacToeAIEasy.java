package sample;

import java.util.Random;

/*
 * Created by earthshine0 on 3/15/2015.
 * Uses random number generator to pick random places on the board.
 */
public class TicTacToeAIEasy extends TicTacToeAI{

    public TicTacToeAIEasy() {
    }

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
        if (aiTurn == false) aiTurn=true;
        else
            aiTurn = false;

        if (aiTurn) createMove();

        return 1; //move was successful

    }

    protected void createMove(){
        //return TicTacToe.genericBtnClick(window.getScene().getClass(),btnTL,moveX,moveY);
        //If future move returns true, that means moveX and moveY are already configured.
        //if it returns false, then AI needs to create its own move
        if (!checkFutureMove())
            generateMove();
    }

    protected void generateMove(){

        Random rngX = new Random();
        Random rngY = new Random();

        do{
            moveX = rngX.nextInt(3);
            moveY = rngY.nextInt(3);
        }while(!checkMove());

    }

}
