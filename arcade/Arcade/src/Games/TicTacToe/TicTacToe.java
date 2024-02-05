package Games.TicTacToe;
import Games.AGame;
import java.util.Scanner;
import java.util.Arrays;
/**
 * TicTacToeGame
 *
 * @author Prof Prairie
 * @version 1.1
 */
public class TicTacToe extends AGame {
    char player1;
    char player2;
    Board b;
    private Scanner scanner = new Scanner(System.in);

    public TicTacToe(char player1, char player2){
        super("Tic Tac Toe");
        this.player1 = player1;
        this.player2 = player2;
        this.b = new Board(3);
    }

    public void play(){
        char currentTurn = player1;

        for(int i=0;i<9;i++){
            System.out.println(this.b);

            Move move = getMove(currentTurn);
            Boolean won;

            try{
                won = this.b.makeMove(move);
            }catch(ThinkingOutsideTheBoxException e){
                System.out.println("Sorry, that move's not valid.  Please try again.");
                continue;
            }

            if(won){
                System.out.println(this.b);
                System.out.println("Congrats!! " + currentTurn + " wins!");
                return;
            }
            currentTurn = switchTurn(currentTurn);

        }

        System.out.println(this.b);
        System.out.println("It's a tie!");

    }

    private char switchTurn(char turn){
        if(turn == this.player1){
            return this.player2;
        }
        else return this.player1;
    }

    public Move getMove(char c){
        System.out.println(c + "'s turn. Please enter row and column separated by a comma (e.g. 0,0)");

        while(true){
            String answer = scanner.nextLine();
            String[] tokens = answer.split(",");
            Arrays.toString(tokens);
            if(tokens.length != 2){
                System.out.println("invalid answer.   Please enter a move in the form of \"row,col\"(e.g. 1,2)");
                continue;
            } 

            try{
                int row = Integer.parseInt(tokens[0]);
                int column = Integer.parseInt(tokens[1]);
                return new Move(c,row,column);
            }catch(Exception e){
                System.out.println("Please enter two numbers split by a comma. (e.g. 1,2)");
                continue;
            }
        }
    }
}
