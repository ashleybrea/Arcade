package Games;

public abstract class AGame implements IGame, Comparable<AGame> {
    String name;

    public AGame(String name) {

        this.name = name;
    }

    public int compareTo(AGame other){
        return (this.name).compareTo(other.name);
    }

    public abstract void play();

    public String toString(){
        return this.name;
    }
}
