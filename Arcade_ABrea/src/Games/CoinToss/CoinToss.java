package Games.CoinToss;
import Games.AGame;
public class CoinToss extends AGame {
    String name;

    public CoinToss(){
        super("CoinToss");
    }

    public void play(){
        System.out.println();
        if(Math.random() < 1.0/2.0){
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}