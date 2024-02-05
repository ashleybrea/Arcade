package Games.RockPaperScissors;

/**
 * 
 *
 * @author Ashley Brea
 * @version 3.0
 * 
 * The Hand class uses Asci to create objects. These objects need a String name, to determine whether theyre rock, paper, 
 * or scissors, and the ascii that will make an image of the hand.
 * 
 * The toString() method is used to express what is going to be shown onces the game begins and a player chooses a Hand. It 
 * will access the name of the object and also the ascii, printing it out, seperated by a line. 
 * 
 * The whoWhins () method takes two different Hands and compares them in order to deteremine which player wins the game.
 */

public class Hand extends Ascii
{
    String name;
    Hand (String name, String ascii) {
        super(ascii);
        this.name = name;

    }

    public String toString () {
        return this.name + "\n" + this.ascii;
    }

    public String whoWins (Hand hand) {
         return "Play the game to win!";
    }
}

