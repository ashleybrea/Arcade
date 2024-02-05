package Games.PetTrainer;

/**
 * Write a description of class Duck here.
 *
 * @author (Ashley Brea)
 * @version (09/26/23)
 */
public class Duck extends Pet
{
    // instance variables 
    public String color;
    //Constructor for objects of class Duck
    public Duck(String color, String name)
    {
        // initialise instance variables
        super(name);// returns the name of the pet

        this.color = color; // returns color of the duck
    }

    public  String toString () {
        return this.color + " " + this.name + " (health = " + health + 
        ", energy = " + energy + ", happiness = " + happiness + ")";
    }

    public String feed () {
        /* Ducklings require a lot of food throughout the day to grow.
         * If their energy is less than 6 and their health is less 
         * than 5, then their happiness will go up by 2 and their health 
         * will go up by 1.
         * On the other hand, their energy will go up by 2, and their health 
         * will go up by 1 and their happiness will go up by 1.
         */
        
        if (energy < 6 && health < 5) {
            this.happiness = (happiness + 2);
            this.health = (health + 1);
            numInRange();

            return "Result: It looks like " + this.name + " had some stale bread ->" +
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health; 
        } else {
            this.energy = (energy + 2);
            this.happiness = (happiness + 1);
            this.health = (health + 1);
            numInRange();
            
            return "Result: " + this.name + " loved their meal! ->"+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        }}

    public String walk (){
        /* Ducks need a lot of exercise to stay mobile and healthy.
         * If their energy is less than 5 than their energy will decrease
         * by 1, health will go up by 2, and happiness will go down by 1. 
         * Otherwise, their health goes up by 1, and their happiness 
         * goes up by 2.
         * 
         */
        if (energy < 5) {
            this.health = (health + 2);
            this.energy = (energy - 1);
            this.happiness = (happiness - 1);
            numInRange();
            
            return "Result: " + this.name + " got really tired from  waddling for so long :( ->" +
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        }else {
            this.health = (health + 1);
            this.happiness = (happiness + 2);
            numInRange();

            return "Result: The walk with " + this.name + " went really well! -> " +
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health; 
        }
    }
}
