package Games.PetTrainer;

/**
 * Builds off of the Pet class by specifying which dog breed it is.
 *
 * @author (Ashley Brea)
 * @version (09/12/2023)
 */
public class Dog extends Pet
{
    // instance variables 
    public String breed;
    //Constructor for objects of class Dog
    public Dog(String breed, String name)
    {
        // initialise instance variables
        super(name);// returns the name of the pet

        this.breed = breed; // returns breed of dog
    }

    public  String toString () {
        return this.breed + " " + this.name + " (health = " + health + 
        ", energy = " + energy + ", happiness = " + happiness + ")";
    }

    public String feed () {
        if (energy <= 7 && health < 6) {
            this.happiness = (happiness - 2);
            this.health = (health - 2);
            numInRange();

            return "Result: It looks like " + this.name + " had a bad chocolate cookie, yikes ->"+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health; 
        } else {
            this.energy = (energy + 2);
            this.happiness = (happiness + 2);
            numInRange();
            
            return "Result: " + this.name + " is looking happy and healthy! ->"+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        }}

    public String walk (){
        if (energy < 5) {
            this.health = (health - 1);
            this.happiness = (happiness - 3);
            numInRange();
            
            return "Result: " + this.name + " got really tired from  walking ->" +
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        }else {
            this.energy = (energy - 1);
            this.health = (health + 2);
            this.happiness = (happiness + 2);
            numInRange();

            return "Result: The walk with " + this.name + " went really well! -> " +
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health; 
        }
    }
}
