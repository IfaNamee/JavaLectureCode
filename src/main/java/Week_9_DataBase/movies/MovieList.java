package Week_9_DataBase.movies;

import java.util.List;

import static input.InputUtils.*;

public class MovieList {

        private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.db";
        private static Database database;

        public static void main(String[] args) {
            database = new Database(DB_PATH);
            addNewMovies();
            displayAllMovies();
            checkIFWatchedAndRate();
            deleteWatchedMovies();
            searchMovie();
        }

        public static int getRatingOutOfFive() {
            int rating = positiveIntInput("What is your rating, in start out of 5?");
            while (rating < 0 || rating > 5) {
                System.out.println("Error enter a number between 0 and 5");
                return rating;
            }
            return rating;
        }
        public static void addNewMovies() {
            do{
                String movieName = stringInput("Enter the movie name");
                boolean movieWatched = yesNoInput("Have you see this movie yet?");
                int movieStars = 0;
                if (movieWatched) {
                    movieStars = getRatingOutOfFive();

                }
                Movie movie = new Movie(movieName, movieStars, movieWatched);
                database.addNewMovie(movie);

            } while (yesNoInput("Add a movie to the watchlist?"));
        }

        public static void displayAllMovies() {
            List<Movie> movies = database.getAllMovies();
            if (movies.isEmpty()) {
                System.out.println("No movies");
            } else {
                for (Movie movie: movies) {
                    System.out.println(movie);
                }
            }
        }

        public  static void checkIFWatchedAndRate() {
            List<Movie> unWatchedMovies = database.getAllMoviesByWatched(false);

            for (Movie movie: unWatchedMovies) {
                boolean hasWatched = yesNoInput("Hove you watched " + movie.getName() + " yet?");
                if (hasWatched) {
                    int stars = positiveIntInput("What is your rating " + movie.getName() + " out of 5?");
                    movie.setWatched(true);
                    movie.setStarts(stars);
                    database.updateMovie(movie);
                }
            }
        }

        public static void deleteWatchedMovies() {
            System.out.println("Here are all the movies you have seen");

            List<Movie> watchedMovies = database.getAllMoviesByWatched(true);

            for (Movie movie: watchedMovies) {
                boolean delete = yesNoInput("Delete " + movie.getName() + "?");
                if (delete) {
                    database.deleteMovie(movie);
                }
            }
        }

        public static void searchMovie() {
            String movieName = stringInput("Enter movie name: ");
            List<Movie> movieMatches = database.search(movieName);

            if (movieMatches.isEmpty()) {
                System.out.println("No matches");
            } else {
                for (Movie movie: movieMatches) {
                    System.out.println(movie);
                }
            }
        }
}
