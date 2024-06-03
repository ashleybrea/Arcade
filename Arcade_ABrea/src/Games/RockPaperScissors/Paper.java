package Games.RockPaperScissors;

/**
 * Write a description of class Paper here.
 *
 * @author (Ashley Brea)
 * @version (3.0)
 * 
 * This Paper() method creates a the hand, Paper,
 * by declaring its name and using Ascii.
 * 
 * We also use the whoWins() method to determine which player 
 * wins the game if player one's hand is Paper
 */
public class Paper extends Hand
{

    public Paper () {
        super("Paper",
        "       _______\n"+
        "  ____(____     \\\n"+
        " (________       |\n"+
        "(_________       |\n"+
        " (________       |\n"+
        "  (___________  /\n");
    }
    
    public String whoWins ( Hand hand ) {
        if (hand.name.equals("Paper")){
            return "It's a tie!";
            
        } else if (hand.name.equals("Scissors")){
            return "Player 2 wins!";
            
        }else if (hand.name.equals("Rock")){
            return "Player 1 wins!" ;
            
        }else return "Something went wrong";
    }

}
