package UnitP3;

public class Rater {

    //attributes - class variables
    private int rating;
    private String review;
    private String name;

    //Constructors
    public Rater(){
        this.rating = 0;
        this.review = "";
        this.name = "Sample Company";
    }

    public Rater(String review, int rating){
        this.name = "The made up company";
        this.rating = rating;
        this.review = review;
    }

    public Rater(String name, String review, int rating){
        this.name = name;
        this.review = review;
        setRating(rating);
    }

    public void updateReview(){
        if(rating >= 3){
            this.review= "Proudly recommended";
        }
        else{
            this.review = "Needs more ratings";
        }
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public void setRating(int newRating){
        if(newRating < 6){
            this.rating = newRating;
            this.updateReview();
        }

    }

    @Override
    public String toString(){

        return "Company name: " + name + " is rated " + rating + " - " + review;
    }

    //Setters and getters




    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

}
