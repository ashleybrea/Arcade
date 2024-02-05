package Games.TicTacToe;

/**
 * Board for playing tic-tac-toe
 *
 * @author Prof Prairie
 * @author Ashley Brea
 * @version 1.1
 */
public class Board
{
    /**
     * Fields go here.
     */
    private char[][] board;
    private int size;
    
    /**
     * Constructor initializes all spots to underscore.
     * 
     * @param size: the dimensions of the square board.
     */
    Board(int size){
        this.size = size;
        this.board = new char[size][size];
        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board[i].length; j++) {
            board[i][j] = ('_');
            
            }
        }
    }
    
    /**
     * toString method prints the board as a square
     * @return String representing the printed board
     */
    public String toString(){
        String retval = "";
        retval = "  ";
        for (int i = 0; i < this.size; i++) {
            retval += i + " ";
        }
        retval += "\n";
        for (int i=0; i < board.length; i++) {
            retval += i + " ";
            for (int j=0; j < board[i].length; j++) {
            retval += board[i][j];
            retval += " ";
            } 
            retval += "\n";
        }
        return retval;
    }

    /**
     * Checks to see if the specified move is valid on the current board.
     * 
     * @param move: represents the potential move.
     */
    public boolean isValidMove(Move move){
        if (move.row >= this.size || move.column >= this.size || 
            move.row < 0 || move.column < 0) {
            return false;
        } else if (board[move.row][move.column] !=  ('_')) {
            return false;
        } else {
        return true; 
        }
    }

    /**
     * Checks to see if a player has won the game.
     * 
     * @param character: the player's character.
     * 
     * @return boolean if the specified player has won.
     */
    public boolean isWinner(char c){
         //Horizontally
        for (int i = 0; i < board.length; i++) {
            boolean Win = true;
           for (int j=0; j < board[i].length; j++) {
             if (board[i][j] != c) {
                 Win = false;
                 break;
             } 
            } 
            
           if (Win) {
               return true;
           }
            } 
        // Vertically
        for (int i = 0; i < board.length; i++) {
            boolean Win = true;
           for (int j = 0; j < board[i].length; j++) {
             if (board[j][i] != c) {
                 Win = false;
                 break;
             } 
            } 
            
           if (Win) {
               return true;
           }
            } 
        // Diagonally Forward
         boolean Win = true;

        for(int i = 0, j = 0; i < board.length; i++, j++){
           if (board[i][j] != c) {
               Win = false;
               break;
           }
        }
         if (Win) {
               return true;
           }
        
        // Diagonally backward
        Win = true;
        for(int i = 0, j = (this.size - 1); i < board.length; i++, j--){
           if (board[i][j] != c) {
               Win = false;
               break;
           }
        }
        
        if (Win) {
               return true;
           }
        
        return false;
    }

    /**
     * Places the move on the board.
     * @throws NotOnMyWatchException for invalid move
     * @param move the move to place on the board
     * @return boolean representing if the move won the game.
     */
    public boolean makeMove(Move move) throws ThinkingOutsideTheBoxException {
        if (!(isValidMove(move))) {
            throw new ThinkingOutsideTheBoxException("Invalid move!");
        } 
        board[move.row][move.column] = move.symbol;
        return isWinner(move.symbol);
    }

}

