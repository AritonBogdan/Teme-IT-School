import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private List<Double> ratings;

    // Constructor
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.ratings = new ArrayList<>();
    }

    // Method to add a rating
    public void addRating(double rating) {
        ratings.add(rating);
    }

    // Method to calculate the average rating
    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }

    // Getters for title and genre
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}
