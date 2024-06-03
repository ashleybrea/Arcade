package Games.RockPaperScissors;
/**
 * Write a description of class Bot here.
 *
 * @Ashley Brea
 * @3.0
 */
/** This method creates a Bot for Player 1 to play 
 * against.The bot randomly chooses Rock Paper 
 * or Scissors
 */
public class Bot 
{
    public static Hand choose() 
    {
        double choice = Math.random() ;

        if (choice < (1.0/3.0)) {
            return new Rock ();

        } else if ((choice >= 1.0/3.0) & (choice > 2.0/3.0)) { 
            return new Paper ();
            
        } else return new Scissors ();
    }
}
