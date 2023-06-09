package Module1_Level3;
public class Movie {
    private final String title;
    private final String actor;
    private final int year;

    public Movie(String title, String actor, int year) {
        this.title = title;
        this.actor = actor;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie = " + title + ", actor = " + actor + ", year = " + year + "]";
    }

}
