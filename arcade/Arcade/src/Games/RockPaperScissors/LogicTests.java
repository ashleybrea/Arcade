package Games.RockPaperScissors;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LogicTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LogicTests
{
    /**
     * Default constructor for test class LogicTests
     */
    public LogicTests()
    {
    }

    @Test

    public void scissorsPaperTest(){

        //assertEquals(expected, actual);

        Hand scissors = new Scissors();

        Hand paper = new Paper();

        assertEquals("Player 1 wins!",scissors.whoWins(paper));

    }

    @Test
    public void scissorsRockTest(){
        //assertEquals(expected, actual);
        Hand scissors = new Scissors();
        Hand rock = new Rock();
        assertEquals("Player 2 wins!",scissors.whoWins(rock));
    }

    @Test

    public void scissorsScissorsTest(){

        //assertEquals(expected, actual);

        Hand scissors = new Scissors();

        Hand sci = new Scissors();

        assertEquals("It's a tie!",scissors.whoWins(sci));

    }

    @Test

    public void paperScissorsTest(){

        //assertEquals(expected, actual);

        Hand paper = new Paper();

        Hand scissors = new Scissors();

        assertEquals("Player 2 wins!",paper.whoWins(scissors));

    }

    @Test
    public void paperRockTest(){
        //assertEquals(expected, actual);
        Hand paper = new Paper();
        Hand rock = new Rock();
        assertEquals("Player 1 wins!",paper.whoWins(rock));
    }

    @Test

    public void paperPaperTest(){

        //assertEquals(expected, actual);

        Hand paper = new Paper();

        Hand poll = new Paper();

        assertEquals("It's a tie!",paper.whoWins(poll));

    }

    @Test

    public void rockScissorsTest(){

        //assertEquals(expected, actual);

        Hand rock = new Rock();

        Hand scissors = new Scissors();

        assertEquals("Player 1 wins!",rock.whoWins(scissors));

    }

    @Test
    public void rockPaperTest(){
        //assertEquals(expected, actual);
        Hand rock = new Rock();
        Hand paper = new Paper();
        assertEquals("Player 2 wins!",rock.whoWins(paper));
    }

    @Test

    public void rockRockTest(){

        //assertEquals(expected, actual);

        Hand rock = new Rock();

        Hand roll = new Rock();

        assertEquals("It's a tie!",rock.whoWins(roll));

    }

    @Test

    public void incorrectTest(){

        //assertEquals(expected, actual);
        
        Hand paper = new Hand("Sike", "(ㅠ﹏ㅠ)");
        
        Hand rock = new Rock();


        assertEquals("Incorrect Input, please try again!",rock.whoWins(paper));

    }
}
