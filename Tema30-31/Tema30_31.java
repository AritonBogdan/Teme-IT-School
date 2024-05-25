import java.util.ArrayList;
import java.util.List;

public class Tema30_31 {

    /**Tema-30-31😯:
     -For a list of strings, create a method that filters out strings with fewer than 5 characters,
     then converts each string to uppercase, and finally sorts them in reverse order.*/

    public static void main(String[] args) {
        // Example list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("kiwi");
        strings.add("cherry");
        strings.add("date");
        strings.add("fig");
        strings.add("grape");

        // Process the strings
        List<String> processedStrings = StringProcessor.processStrings(strings);

        // Print the processed strings
        for (String str : processedStrings) {
            System.out.println(str);
        }
    }
}
