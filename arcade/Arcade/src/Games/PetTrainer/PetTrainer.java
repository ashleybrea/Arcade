package Games.PetTrainer;
import Games.AGame;
import java.util.Scanner;
/**
 *
 * @author (Ashley Brea)
 * @version (09/26/2023)
 */
public class PetTrainer extends AGame {

    public PetTrainer(){
        super("Pet Trainer");
    }
    public void play(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ashley's Pet Trainer game!" + "\n");
        //creating cat object ""  |\_/| "  |\_/|"
        System.out.println("Lets customize your cat" + " /ᐠ - ˕ -マ Ⳋ");
        System.out.println("Lets first choose the name of your cat.");
        String catsName = scanner.nextLine();

        System.out.println("Now let's choose the color.");
        String catsColor = scanner.nextLine();
        Pet pet1 = new Cat(catsColor, catsName);
        //creating dog object
        System.out.println("Lets customize your dog" + " ᴖ - ﻌ • ა");
        System.out.println("Okay, now lets choose the name of your dog!");
        String dogsName = scanner.nextLine();

        System.out.println("Now let's choose the dog's breed.");
        String dogsBreed = scanner.nextLine();
        Pet pet2 = new Dog(dogsBreed, dogsName);
        //crating chinchilla object
        System.out.println("Lets customize your chinchilla" + " …ᘛ⁐̤ᕐᐷ");
        System.out.println("Lets choose their name!");
        String chinnieName = scanner.nextLine();

        System.out.println("Now let's choose the tail-type: short or long.");
        String chinnieTail = scanner.nextLine();
        Pet pet3 = new Chinchilla(chinnieTail, chinnieName);

        System.out.println("Lets customize your duck" + " ( •ө• )");
        System.out.println("Okay, now lets choose the name of your duck!");
        String duckName = scanner.nextLine();

        System.out.println("Now let's choose the duck's color.");
        String duckColor = scanner.nextLine();
        Pet pet4 = new Duck(duckColor, duckName);

        for (int i = 1; i < 6; i++){
            System.out.println("----- Round " + i + " -----");
            String action1 = askForInput(pet1);
            pickAndRunAction(pet1, action1);

            String action2 = askForInput(pet2);
            pickAndRunAction(pet2, action2);

            String action3 = askForInput(pet3);
            pickAndRunAction(pet3, action3);

            String action4 = askForInput(pet4);
            pickAndRunAction(pet4, action4);
        }

        System.out.println(pet1.whoWins(pet2, pet3, pet4));
    }


    public static String askForInput (Pet pet) {
        System.out.println("\n" + "Here are your available actions: feed, walk");
        System.out.println("Pick an action for " + pet.toString());
            while(true) { 
            Scanner scanner = new Scanner(System.in);
            String action1 = scanner.nextLine().toLowerCase();   
            if(!(action1.equals("feed"))  && !(action1.equals("walk"))) { 
                System.out.println("Looks like you gave an invalid action. Try again");

            } 
            else { 
                return action1; 
            } 
        }
    }

    public static void pickAndRunAction (Pet pet, String userInput) {
        //System.out.println("Pick an action for" + pet.toString());
        if (userInput.equals("walk")) {
            System.out.println(pet.walk()); 
        } else if (userInput.equals("feed")) {
            System.out.println(pet.feed());
        } 
    }
}
