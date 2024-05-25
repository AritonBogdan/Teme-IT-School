public class Tema26_27 {
    /**
     * Tema-26-27🥳:
     * -Create a generic class Box<T> that can store a single item of any type.
     * Implement methods to set and get the item from the box.
     * -Design a Movie class with attributes like title, genre, and a list of ratings.
     * Create a method that retrieve the average rating for any movie.
     */
    public static void main(String[] args) {
        // Example usage of Box class
        BoxT<String> stringBox = new BoxT<>();
        stringBox.setItem("Hello World");
        System.out.println("String in Box: " + stringBox.getItem());

        BoxT<Integer> integerBox = new BoxT<>();
        integerBox.setItem(123);
        System.out.println("Integer in Box: " + integerBox.getItem());

        // Example usage of Movie class
        Movie movie = new Movie("Inception", "Sci-Fi");
        movie.addRating(8.8);
        movie.addRating(9.0);
        movie.addRating(9.5);

        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Average Rating: " + movie.getAverageRating());
    }
}
