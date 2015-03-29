package sample;

import java.util.Random;

/*
 * Created by earthshine0 on 3/15/2015.
 * Uses random number generator to pick random places on the board.
 */
public class TicTacToeAIEasy extends TicTacToeAI{

    public TicTacToeAIEasy(int AIOption) {
        super(AIOption);
    }

    protected void AITurn(){
        if (checkFutureMove()) return;
        createMove();
    }

    protected int createMove(){

        Random rngX = new Random();
        Random rngY = new Random();

        do{
            moveX = rngX.nextInt(3);
            moveY = rngY.nextInt(3);
        }while(!checkMove());

        return 0;
    }



}
