package Games.PetTrainer;

/**
 * Write a description of class Cat here.
 *
 * @author (Ashley Brea)
 * @version (09/26/2023)
 */
public class Cat extends Pet
{
    // instance variables 
    public String color; 
    public String cat;
    // Constructor for objects of class Cat
    public Cat(String color, String name){
        // initialise instance variables
        super(name);// returns the name of the pet

        this.cat = "cat";// returns the type of animal

        this.color = color; // returns the color of the cat
    }

    public  String toString () {
        return this.color + " " + this.cat + " " + this.name +"(health = " 
        + health + ", energy = " + energy + ", happiness = " + happiness + ")";
    }

    public String feed () {
        double prob = Math.random ();
        if (prob <= 1.0/2.0) {
            this.happiness = (happiness - 2);
            numInRange();
            
            return "Result: " + this.name + " was not vibing with the food, yikes ->" +
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
            } else {
            this.energy = (energy + 2);
            this.happiness = (happiness + 2);
            numInRange();
            
            return "Result: " + this.name + " is looking happy and healthy! -> "+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        }
    }


    public String walk (){
        double prob = Math.random ();
        if (prob <= 1.0/2.0) {
            this.health = (health - 2);
            this.energy = (energy + 3);
            this.happiness = (happiness + 2);
            numInRange();

            return "Result: " + this.name + " wasn't in the mood to walk. So they just ate a snack ->"+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        } else if (energy < 5) {
            this.happiness = (happiness - 2);
            this.health = (health + 1);
            numInRange(); 
            
            return "Result: " + "Looks like " + this.name + " got hurt during the walk ->"+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        }else {
            this.energy = (energy - 1);
            this.health = (health + 3);
            numInRange();

            return "Result: The walk went really well! -> " +
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health; 
        }
    }
}
