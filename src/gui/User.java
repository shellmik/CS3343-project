package gui;

public class User {
    private String name;
    private int score;
    private String date;


    public User() {

    }

    public User(String name, int score, String date) {

        this.name = name;
        this.score = score;
        this.date = date;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public int getScore() {

        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public String toString() {
        return name + "           " + score + "         " + date;
    }

}