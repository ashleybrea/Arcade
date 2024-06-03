import Games.CoinToss.CoinToss;
import Games.RockPaperScissors.RockPaperScissors;
import Games.TicTacToe.TicTacToe;
import Games.PetTrainer.PetTrainer;
import java.util.Arrays;
import java.util.Scanner;
import Games.AGame;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ashley's Game Mania!" + " б（＞ε＜）∂" + "\n");

        AGame[] arcade = {new TicTacToe('x', '0'), new CoinToss(), new RockPaperScissors(), new PetTrainer() };
        Arrays.sort(arcade);


        boolean played = true;
        while (played){
            System.out.println("Pick the game you'd like to play, based on it's corresponding number. Or exit the arcade if you're a loser " + " (•‾⌣‾•)و ̑̑♡");
            for(int i = 0; i < arcade.length; i++) {
                System.out.println(i + ": " + arcade[i]);
            }
            System.out.println("4: Exit Arcade");

            int choice = -1;
            while(choice < 0 || choice > arcade.length){
            try{
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > arcade.length){
                    System.out.println("That doesn't look like one of our corresponding numbers. Try again! Reading is fundamental you know-");
                }
            } catch (Exception e){
                System.out.println("That doesn't look like one of our corresponding numbers. Try again! Reading is fundamental you know-");
            }
        }
        if (choice == 4) {
            System.out.println("88" + "\n" + "88" + "\n" + "88" + "\n" + "88  ,adPPYba,  ,adPPYba,  ,adPPYba, 8b,dPPYba,");
            System.out.println("88 a8\"     \"8a I8[    \"\" a8P_____88 88P'   \"Y8");
            System.out.println("88 8b       d8  `\"Y8ba,  8PP\"\"\"\"\"\"\" 88");
            System.out.println("88 \"8a,   ,a8\" aa    ]8I \"8b,   ,aa 88          ");
            System.out.println("88  `\"YbbdP\"'  `\"YbbdP\"'  `\"Ybbd8\"' 88          ");

            played = false;
        } else {
            AGame one = arcade[choice];
            one.play();
        }
            }
    }
}