public class Tema12 {
    public static void main(String[] args) {
/**1. Create a Java program to find and print the length of a given string.*/
        String cuvant = "Maimuta";
        int lungimeaCuvantului = cuvant.length();
        System.out.println("Cuvantul " + cuvant + " are " + lungimeaCuvantului + " litere");


/**2. Create a Java program that finds and prints the character at a given index(2) in a string.*/
        String caracter = "elefant";
        if (caracter.length() > 2) {
            char caracterIndex = caracter.charAt(2);
            System.out.println("Litera pentru indexul 2 este " + caracterIndex);
        } else {
            System.out.println("Indexul 2 este in afara parametrilor");
        }


/**3. Create a Java program that finds and prints the index of the first occurrence of a character in a string. */
        String cuvant1 = "parlament";
        if (cuvant1.length() > 0) {
            char Index = cuvant1.charAt(0);
            System.out.println("The first occurance in the word  " + cuvant1 + " is " + Index);
        } else {
            System.out.println("There is no occurance");
        }


/**4. Create a Java program that prints a substring of a given string from a specified start index(1) to end index(3).*/
        String cuvant2 = "guvern";
        if (cuvant2.length() >= 3) {
            String substring = cuvant2.substring(1, 4);
            System.out.println("Substring from index 1 to 3 is: " + substring);
        } else {
            System.out.println("The length of the string is less than 3.");
        }

/**5. Create a Java program that converts a given string to uppercase and lowercase and prints both outputs.*/
        String cuvant3 = "cuvantul";
        String cuvantNou = cuvant3.toUpperCase();
        String cuvantNouMic = cuvantNou.toLowerCase();
        System.out.println(cuvantNou);
        System.out.println(cuvantNouMic);
    }
}
