package Games.RockPaperScissors;

/**
 * Write a description of class Rock here.
 *
 * @author Ashley Brea
 * @version 3.0
 * This Rock() method creates a the hand, Rock,
 * by declaring its name and using Ascii.
 * 
 * We also use the whoWins() method to determine which player 
 * wins the game if player one's hand is Rock
 */
public class Rock extends Hand
{
    public Rock () {
        super("Rock", " _.-.-.-.\n"+
            ";_|_|_|_|_\n"+
            "|_|_|\\__  \\\n" +
            "|    . '  |\n" +
            "|   (    /\n" +
            " \\______/\n"); 

    }
    public String whoWins ( Hand hand ) {
        if (hand.name.equals("Rock")){
            return "It's a tie!";
            
        } else if (hand.name.equals("Paper")){
            return "Player 2 wins!";
            
        }else if (hand.name.equals("Scissors")){
            return "Player 1 wins!" ;
            
        }else return "Incorrect Input, please try again!";
    }
}
