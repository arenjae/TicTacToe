package sample;

import java.util.Random;

/**
 * Created by earthshine0 on 3/31/2015.
 */
public class TicTacToeAIHard extends TicTacToeAI {

    public TicTacToeAIHard() {
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