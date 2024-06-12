import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

        public static List<String> filterAndSortPeople(List<Person> people) {
            // Pasul 1: Filter out people younger than 18 or those who live in "Metropolis"
            List<Person> filteredPeople = people.stream()
                    .filter(person -> person.getAge() >= 18 && !person.getCity().equals("Metropolis"))
                    .collect(Collectors.toList());

            // Pasul 2: Extract the names of the remaining people
            List<String> names = filteredPeople.stream()
                    .map(Person::getName)
                    .collect(Collectors.toList());

            // Pasul 3: Sort the names in reverse order
            names.sort(Comparator.reverseOrder());

            return names;
        }
}
