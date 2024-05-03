package Week_9_DataBase.movies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private String databasePath;
    Database(String databasePath) {  // constructor

        // create table, or make sure it is created.

        this.databasePath = databasePath;

        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()) {

            statement.execute("CREATE TABLE IF NOT EXISTS" +
                    "movies (id INTEGER PRIMARY, " +
                    "name text unice check(lenght(name) >= 1), " +
                    "stars INTEGER CHECK (stars >= 0 and stars <= 5), " +
                    "watched BOOLEAN) ");

        } catch (SQLException e) {
            System.out.println("Error creating movies DB table because " + e);
        }
    }

    public void addNewMovie (Movie movie) {

        String insertSQL = "INSERT INTO movies (name, stars, watched) VALUES (?,?,?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            // insert into movies values
            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStarts());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Error adding movie " + movie + " because " + e);
        }
    }

    public List<Movie> getAllMovies() {
        try (Connection connection = DriverManager.getConnection(databasePath);
             Statement statement = connection.createStatement()
        ) {
            // get all movies
            ResultSet movieResult = statement.executeQuery("SELECT * FROM movies ORDER BY name");

            List<Movie> movies = new ArrayList<>();

            while (movieResult.next()) {
                int id = movieResult.getInt("id");
                String name = movieResult.getNString("name");
                int starts = movieResult.getInt("stars");
                boolean watched = movieResult.getBoolean("watched");

                Movie movie = new Movie(id, name, starts, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException e) {
            System.out.println("Error fetching all movies because " + e);
            return null;
        }
    }

    public List<Movie> getAllMoviesByWatched(boolean watchedStatus) {
        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " +
                     "movies WHERE watched = ?")) {
            preparedStatement.setBoolean(1, watchedStatus);
            ResultSet movieResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();

            while (movieResults.next()) {
                int id = movieResults.getInt("id");
                String name = movieResults.getNString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException e) {
            System.out.println("Error getting movies because " + e);
            return null;
        }
    }

    public void updateMovie(Movie movie) {

        String sql = "UPDATE movies SET stars = ?, watched = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, movie.getStarts());
            preparedStatement.setBoolean(2, movie.isWatched());
            preparedStatement.setInt(3, movie.getId());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Error updating movies " + movie + " because" + e);
        }
    }

    public void deleteMovie(Movie movie) {

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM movies WHERE id = ?")) {

            preparedStatement.setInt(1, movie.getId());
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Error delete movies " + movie + " because" + e);
        }
    }


    public List<Movie> search (String searchTerm) {

        String sql = "SELECT * FROM movies WHERE UPPER(name) LIKE UPPER(?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, "%" + searchTerm + "%");
            ResultSet moviesResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();

            while (moviesResults.next()) {
                int id = moviesResults.getInt("id");
                String name = moviesResults.getNString("name");
                int stars = moviesResults.getInt("stars");
                boolean watched = moviesResults.getBoolean("watched");

                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException e) {
            System.out.println("Error searching for " + searchTerm + " because" + e);
            return null;
        }
    }
}
