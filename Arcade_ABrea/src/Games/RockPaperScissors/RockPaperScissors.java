package Games.RockPaperScissors;
import Games.AGame;
import java.util.Scanner;
/**
 * Write a description of class RockPaperScissors here.
 *
 * @author (Ashley Brea)
 * @version (3.0)
 * The method play() is how we are able to run the game. It deteremines whether it's 
 * single-player or two-player and from there it compares hand to determine who wins.
 * The loops allow for the game to go on as long or as little as the player desires.
 */
public class RockPaperScissors extends AGame {

    public RockPaperScissors(){

        super("Rock Paper Scissors");
    }

    public void play (){
        Scanner scanner = new Scanner(System.in);
        boolean quitGame = false;
        System.out.println("Welcome to Ashley's Rock Paper Scissors Tournament to the Death!"); 
        while (!quitGame) {
            System.out.println("How many players? (1 or 2)");
            int numPlayers = (-1);

            while (!(numPlayers == 1 || numPlayers == 2)){
                try {
                    numPlayers = Integer.parseInt(scanner.nextLine());;
                } catch(NumberFormatException e){
                    System.out.println("Unfortunately you gave us a non-number. Let's try again!");
                }

                if ((!(numPlayers == 1 || numPlayers == 2))){
                    System.out.println("That number isn't 1 or 2, lets try that again!");
                }
            }

            System.out.println("Player 1, pick you weapon");
            Hand player_one = null;
            while (player_one == null) {
                player_one = create_object(scanner.nextLine().toLowerCase()); 
            }

            System.out.println("\f");

            Hand player_two = null;
            if (numPlayers == 2){
                System.out.println("Player 2, pick you weapon");
                while (player_two == null) {
                    player_two = create_object(scanner.nextLine().toLowerCase()); 
                }
            } 
            else player_two = Bot.choose ();

            System.out.println("\f");
            System.out.print(player_one);
            System.out.print(player_two);
            System.out.print(player_one.whoWins(player_two));

            System.out.print("Press q to quit or press any other key to continue playing");
            quitGame = scanner.nextLine().toLowerCase().equals("q"); 

        }
    }

    public Hand create_object (String input) {
        if (input.equals("rock")){
            return new Rock();
        } else if (input.equals("paper")){
            return new Paper();
        } else if (input.equals("scissors")){
            return new Scissors();
        } else 
        {System.out.println("Invalid output, lets try that again:)");
            return null;
        }  
    }
}
