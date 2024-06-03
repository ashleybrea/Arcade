package Games.RockPaperScissors;

/**
 * Write a description of class Scissors here.
 *
 * @author (Ashley Brea)
 * @version (3.0)
 * 
 * This Scissors() method creates a the hand, Scissors,
 * by declaring its name and using Ascii.
 * 
 * We also use the whoWins() method to determine which player 
 * wins the game if player one's hand is Scissors
 */

public class Scissors extends Hand
{
    public Scissors () {
        super("Scissors" , 
            "    .-." + "\n" +
            "    | |    / )" + "\n" +
            "    | |   / /" + "\n" +
            "    | |  / /" + "\n" +
            " _.-| |_/ /" + "\n" +
            "; \\( \\   /" + "\n" + 
            "|\\_)\\ \\  |" + "\n" +
            "|    ) \\ |" + "\n" +
            "|   (    /" + "\n" +
            " \\______/\n");

    }
    
    public String whoWins ( Hand hand ) {
        if (hand.name.equals("Scissors")){
            return "It's a tie!";
            
        } else if (hand.name.equals("Paper")){
            return "Player 1 wins!";
            
        }else if (hand.name.equals("Rock")){
            return "Player 2 wins!" ;
            
        }else return "Something went wrong";
    }

}
