import java.util.ArrayList;

public class ListManager {

    /**
     * Tema20-21 Create a class named ListManager. In this class, create a method named initializeList
     * which takes no parameters and returns an ArrayList of integers. The method should create an ArrayList,
     * add the integers 1 to 5 to the list, and then return the list.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = initializeList();
        System.out.println("Initialized List: " + list);
    }

    public static ArrayList<Integer> initializeList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        return list;
    }
}

