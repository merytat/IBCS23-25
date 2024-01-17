package UnitP2;

public class Player {
    //attributes
    private String name;
    private double avScore;
    private int rank;

    //constructors
    public Player(){
        name = "guest";
        avScore = 0;
        rank = 100;
    }

    public Player(String name, double avScore, int rank){
        this.name = name;
        this.avScore = avScore;
        this.rank = rank;
    }

    //Mutators
    //are always void and always have parameters
    public void setName(String newName){
        this.name = newName;
    }

    public void setAvScore(double avScore){
        this.avScore = avScore;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    //Accessor
    //are always return and always no parameters
    public String getName(){
        return name;
    }

    public int getRank(){
        return rank;
    }

    public double getAvScore(){
        return avScore;
    }
}
