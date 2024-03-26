import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tema13 {
    public static void main(String[] args) {
/**1. Create a Java program that uses a StringBuilder to concatenate an array of strings.
 *  The program should print the final concatenated string. (methods: append())*/
        String[] strings = {"Tom", " ", "Jerry", "!"};
        StringBuilder stringbuilder = new StringBuilder();
        for (String str : strings) {
            stringbuilder.append(str);
        }
        String concatenate = stringbuilder.toString();
        System.out.println("Concatenated String is " + concatenate);

/**2. Create a class named Student with name and age fields. Write a method to display the details of a student.*/
        Student student = new Student();
        student.nume = "Alexandrescu";
        student.prenume = "Mirel";
        student.varsta = 19;
        System.out.println("Numele studentului este " + student.nume + " " + " " + student.prenume + " iar varsta acestuia este de " + student.varsta + " ani");


/**3. Write a program that prints the current date.*/
        LocalDate dataDeAzi = LocalDate.now();
        System.out.println("Data de azi este: " + dataDeAzi);


/**4.  Print the date that will be after 10 days from today.*/
        LocalDate dataCurenta = LocalDate.now();
        LocalDate dataDinViitor = dataCurenta.plusDays(10);
        long zileDifenreta = ChronoUnit.DAYS.between(dataCurenta, dataDinViitor);
        System.out.println("Peste "+ zileDifenreta + " zile ne vom afla in data de: " + dataDinViitor);


    }
}
