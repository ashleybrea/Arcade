package Games.PetTrainer;

/**
 * Gives every Pet a name, and initializes its health, happiness, and energy levels.
 *
 * @author (Ashley Brea)
 * @version (09/26/2023)
 */
public class Pet
{
    // instance variables
    String name;
    int health;
    int happiness;
    int energy;
    //Constructor for objects of class Pet
    Pet (String name){
        this.name = name;// returns the name of the pet
        // health, happiness, and energy are initialized to starting values
        health = 5;
        happiness = 5;
        energy = 5;
    }

    public String walk() { 
        return "This is in the pet class"; 
    }

    public String feed() { 
        return "This is in the pet class"; 
    }

    public String toString () {
        return "Pet " + this.name +"(health = " + health + ", energy = " + 
        energy + ", happiness = " + happiness + ")";
    }

    public void numInRange() {
        if (this.health > 10) {
            this.health = 10;
        } else if (this.health < 0) {
            this.health = 0;
        }
        if (this.happiness > 10) {
            this.happiness = 10;
        } else if (this.happiness < 0) {
            this.happiness = 0;
        }
        if (this.energy > 10) {
            this.energy = 10;
        } else if (this.energy < 0) {
            this.energy = 0;
        }
    }

    public String whoWins (Pet pet2, Pet pet3, Pet pet4){
        int pet1Stats;
        int pet2Stats;     
        int pet3Stats;
        int pet4Stats;
        String pet1ascii = " /ᐠ - ˕ -マ Ⳋ ";
        String pet2ascii = " ᴖ - ﻌ • ა ";
        String pet3ascii = " …ᘛ⁐̤ᕐᐷ ";
        String pet4ascii = " ( •ө• ) ";
        pet1Stats = this.happiness + this.energy + this.health;
        pet2Stats = pet2.happiness + pet2.energy + pet2.health;
        pet3Stats = pet3.happiness + pet3.energy + pet3.health;
        pet4Stats = pet4.happiness + pet4.energy + pet4.health;
        if (pet1Stats > pet2Stats && pet1Stats > pet3Stats && pet1Stats > pet4Stats) {
            return "----- " + pet1ascii + this.name + " wins the game!" + pet1ascii +  "-----";
        } else if (pet2Stats > pet1Stats && pet2Stats > pet3Stats && pet2Stats > pet4Stats) {
            return "----- " + pet2ascii + pet2.name + " wins the game!" + pet2ascii + "-----";   
        } else if (pet3Stats > pet1Stats && pet3Stats > pet2Stats && pet3Stats > pet4Stats)
            {  return "----- " + pet3ascii + pet3.name + " wins the game!" + pet3ascii + "-----";
        } else if (pet4Stats > pet1Stats && pet4Stats > pet2Stats && pet4Stats > pet3Stats){ 
            return "----- " + pet4ascii + pet4.name + " wins the game!" + pet4ascii +"-----"; 
        } else { return "----- (╥﹏╥) we have a tie (╥﹏╥) -----";
        }
    }
    }
