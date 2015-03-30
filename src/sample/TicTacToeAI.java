package sample;

/*
 * This class will conduct the AI (basic)
 * It will push buttons like an actual person.
 * There are subclasses for each level of AI (easy, normal, hard)
 * Created by earthshine0 on 3/15/2015.
 */
public class TicTacToeAI extends TicTacToe{

    protected int moveX, moveY;

    public TicTacToeAI() {

    }


    /*Method that reads the available places to move in TicTacToe
     * and moves to it
    */
    protected boolean checkFutureMove(){
        //Get a copy of the board
        //Systematically iterate through the board, putting in an move at each square
        //and then check to see if it would be a winning move. If it is, then put a place there.
        //This checks two things, if the user will win with that move, and if the AI will win with that move
        int [][] testBoard = null;
        System.arraycopy(board,0,testBoard,0,9);
        //generate a move (1-6, as long as it is not already occupied)
        //test move as player (if player will win, then move there)
        //then test move as AI (if AI will win, then move there)

        int computer = player;
        int user = player; //WRONG, change later to opposite of player

        for (moveX = 0; moveX<3;moveX++){
            for(moveY = 0; moveY<3;moveY++){
                if (testBoard[moveX][moveY]==0){
                    testBoard[moveX][moveY]=computer;
                    if (checkBoardDirections(testBoard))
                        return true;
                }
                System.arraycopy(board,0,testBoard,0,9);
            }
        }

        for (moveX = 0; moveX<3;moveX++){
            for(moveY = 0; moveY<3;moveY++){
                if (testBoard[moveX][moveY]==0) {
                    testBoard[moveX][moveY] = user;
                    if (checkBoardDirections(testBoard)) return true;
                }
                System.arraycopy(board,0,testBoard,0,9);
            }
        }


        return false;
    }

    protected void createMove(){
        //return TicTacToe.genericBtnClick(window.getScene().getClass(),btnTL,moveX,moveY);
        //If future move returns true, that means moveX and moveY are already configured.
        //if it returns false, then AI needs to create its own move
        if (!checkFutureMove()){
            generateMove();
        }

    }

    protected void generateMove(){

    }

    protected boolean checkMove(){

        int [][] testBoard = board.clone();
        if (checkBoardDirections(testBoard) || checkFullBoard(testBoard)){
            genericBtnClick(moveX,moveY);
            return true;
        }

        return false;
    }


}
