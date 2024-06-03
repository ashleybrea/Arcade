package Games.RockPaperScissors;

/**
 * Write a description of class Ascii here.
 *
 * @Author Ashley Brea
 * @Version 3.0
 * 
 * String ascii makes the ascii input a string, 
 * and is returned as a string. These methods are
 * integral to the rest of the program as Hand extends 
 * Ascii and other classes extend Hand
 */
public class Ascii {
    String ascii; 
    Ascii (String ascii) {
        this.ascii = ascii;
    }

    public String toString () {
        return this.ascii;
    }
}
