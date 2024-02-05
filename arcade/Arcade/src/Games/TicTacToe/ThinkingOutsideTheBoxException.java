package Games.TicTacToe;

/**
 * Write a description of class InvalidMoveException here.
 *
 * @author Prof Prairie
 * @author Ashley Brea
 * @version 1.1
 */
public class ThinkingOutsideTheBoxException extends IllegalArgumentException
{
    ThinkingOutsideTheBoxException(){
    }

    ThinkingOutsideTheBoxException(String msg){
        super(msg);
    }
}
