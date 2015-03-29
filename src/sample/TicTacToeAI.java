package sample;

/*
 * This class will conduct the AI (basic)
 * It will push buttons like an actual person.
 * There are subclasses for each level of AI (easy, normal, hard)
 * Created by earthshine0 on 3/15/2015.
 */
public class TicTacToeAI extends TicTacToe{

    protected int moveX, moveY;

    public TicTacToeAI(int AIOption) {
        super(AIOption);
    }


    /*Method that reads the available places to move in TicTacToe
     * and moves to it
    */
    protected boolean checkFutureMove(){
        //Get a copy of the board
        //Systematically iterate through the board, putting in an move at each square
        //and then check to see if it would be a winning move. If it is, then put a place there.
        //This checks two things, if the user will win with that move, and if the AI will win with that move



        return false;
    }

    protected int createMove(){
        //return TicTacToe.genericBtnClick(window.getScene().getClass(),btnTL,moveX,moveY);


        return 0;
    }

    protected boolean checkMove(){
        return false;
    }


}
