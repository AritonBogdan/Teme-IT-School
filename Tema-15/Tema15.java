import java.util.ArrayList;
import java.util.Random;

public class Tema15 {
    public static void main(String[] args) {

/**3. Generate a random integer between 1 and 100.*/
        Random random = new Random();
        int numarRandom = random.nextInt(100) + 1;
        System.out.println("Numarul aleatoriu intre 1 si 100 este: " + numarRandom);

/**4. Choose a random element from the array {"apple", "banana", "cherry", "date"}.*/
        String[] fructe = {"mar", "banana", "cherry", "date"};
        Random random1 = new Random();
        int indexAleatoriu = random1.nextInt(fructe.length);
        String fructeAleatorii = fructe[indexAleatoriu];
        System.out.println("Fructul aleatoriu este: " + fructeAleatorii);

/**5. Create an ArrayList and add 5 elements to it. Determine and print the size of the ArrayList*/

        ArrayList<String> listaArray = new ArrayList<>();
        listaArray.add("Elementul 1");
        listaArray.add("Elementul 2");
        listaArray.add("Elementul 3");
        listaArray.add("Elementul 4");
        listaArray.add("Elementul 5");
        int dimensiune = listaArray.size();
        System.out.println("Dimensiunea listei Array este: " + dimensiune);
    }
}
