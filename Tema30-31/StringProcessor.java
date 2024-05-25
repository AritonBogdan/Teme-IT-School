import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringProcessor {
    public static List<String> processStrings(List<String> input) {
        // Filter strings with fewer than 5 characters, convert to uppercase, and sort in reverse order
        return input.stream()
                .filter(s -> s.length() >= 5)
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
