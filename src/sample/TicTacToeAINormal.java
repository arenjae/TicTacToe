package sample;

import java.util.Random;

/**
 * Created by earthshine0 on 3/31/2015.
 */


public class TicTacToeAINormal extends TicTacToeAI{

    public TicTacToeAINormal() {
    }


    protected void generateMove(){

        Random rngX = new Random();
        Random rngY = new Random();

        do{
            moveX = rngX.nextInt(3);
            moveY = rngY.nextInt(3);
        }while((board[moveX][moveY]!=0));

    }

}