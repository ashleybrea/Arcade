package Games.PetTrainer;

/**
 * Write a description of class Chinchilla here.
 *
 * @author (Ashley Brea)
 * @version (09/26/2023)
 */
public class Chinchilla extends Pet
{
    // instance variables
    public String tail_type; // There are either long-tailed or short tailed chinchillas

    public String chinchilla; // to state the type of animal it is

    //Constructor for objects of class Chinchilla
    public Chinchilla(String tail_type, String name)
    {
        // initialise instance variables
        super(name); // returns the name of the pet

        this.chinchilla = "Chinchilla"; // returns the type of animal

        this.tail_type = tail_type;// returns type of tail that distinguishes
        //chinchillas
    }

    public  String toString () {
        return this.tail_type + " " + this.chinchilla + " " + this.name +
        "(health = " + health + ", energy = " + energy + ", happiness = " + 
        happiness + ")";
    }

        public String feed () {
        /* Chinchillas love to eat for long periods of time, but mostly during
         * the night. There's a 50% chance they're feed in the night vs the
         * morning. With 50% probability, its nighttime and they eat their
         * hearts out. Health and happiness increase by 2, but they get 
         * tired and sleepy so their energy goes down by 1.
         * 
         * With other 50% probability they're fed in the morning and woke up hungry. This decreases
         * their energy by 3. Increases their health and happiness by 1.
         */
        double prob = Math.random ();
        if (prob <= 1.0/2.0) {
            this.happiness = (happiness + 2);
            this.health = (health + 2);
            this.energy = (energy - 1);
            numInRange();
            
            return "Result: " + this.name + " loved the food! They ate it all throughout the night ->"+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        } else {
            this.energy = (energy - 3);
            this.happiness = (happiness + 1);
            this.health = (health + 1);
            numInRange();
            
            return "Result: " + this.name + "'s enjoying the food, but they were hungry all night :( -> "+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        }
    }

    public String walk (){
        /* Chinchillas love exploring their surroundings and discovering new things. So 
         * they love walks! If their energy level is less than 5 their health will go down 
         * by 1 but happiness will go up by 2 because of the scenery. If their energy is 
         * 5 or more than going on a walk will increase their health by 2, and their
         * happiness by 3.
         */
        if (energy < 5) {
            this.health = (health - 1);
            this.happiness = (happiness + 2);
            numInRange();
            
            return "Result: " + this.name + " was a little tired for a walk, but they loved the scenery. ->"+
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health;
        }else {
            this.health = (health + 2);
            this.happiness = (happiness + 3);
            numInRange();
            
            return "Result: " + this.name + " loved walking so much! ->" +
            "(happiness=" + this.happiness + ", energy=" + this.energy  + ", health=" 
            + this.health; 
        }
    }
}
