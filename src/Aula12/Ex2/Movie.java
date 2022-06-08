package Aula12.Ex2;

public class Movie {

    private String name;
    private float score;
    private String rating;
    private String genre;
    private int runningTime;

    public Movie(String name, float score, String rating, String genre, int runningTime) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = runningTime;
    }

    public String getName() {
        return this.name;
    }

    public float getScore() {
        return this.score;
    }

    public String getRating() {
        return this.rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRunningTime() {
        return this.runningTime;
    }

    @Override
    public String toString() {
        return String.format("%-40s\t%-5s\t%-6s\t%-10s\t%s", this.name, this.score, this.rating, this.genre,
                this.runningTime);
    }
}
