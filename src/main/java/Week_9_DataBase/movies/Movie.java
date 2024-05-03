package Week_9_DataBase.movies;

public class Movie {

    private int id;
    private String name;
    private int starts;
    private boolean watched;

    Movie(String name, int stars, boolean watched) {
        this.name = name;
        this.starts = stars;
        this.watched = watched;
    }

    Movie(int id,String name, int stars, boolean watched) {
        this.id = id;
        this.name = name;
        this.starts = stars;
        this.watched = watched;
    }
    @Override
    public String toString() {
        return "ID " + id + " Movie name: " + name + " is rated " + starts + " stars. Have you watched this? " + watched;
    }

    public int getId() { return id;}

    public void setId(int id) { this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
