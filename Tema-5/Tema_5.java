import java.util.Scanner;

public class Tema_5 {
    public static void main(String[] args) {
/** Challenge 1. Write a Java program to take two numbers as input and display the result of addition,
 subtraction, multiplication, division, and modulus.*/
        int a = 10, b = 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

/** Challenge 2. Create a Java program  where you increment and decrement the same variable.
 display the value of the variable after each operation.*/
        int variabilaX = 0;
        System.out.println("Variabila normala " + variabilaX);
        System.out.println("Variabila cu increment " + ++variabilaX);
        System.out.println("Variabile dupa increment " + variabilaX);
        System.out.println("Variabila cu decrement " + --variabilaX);

/** Challenge 3.Write a program to check if a number is positive or negative using logical complement operator*/
        int number = 10;
        boolean numarPozitiv = !(number < 0);
        if (numarPozitiv) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

/** Challenge 4.Write a JAva program that uses both the increment(++)and decremenet(--) operators in a loop
 *  to count up to 10 an then back down to 1 */
        int numaratorX = 0;
        System.out.println(numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(++numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);
        System.out.println(--numaratorX);

/** Challenge 5.Create a Java program that demostrates the use of each compound assignment operator with integers*/
        int numarC = 2, numarB = 4;
        numarB = numarC + numarB;
        numarB *= numarC;
        System.out.println(numarB);

/** Challenge 6.Write a Java program that take two numbers from the user and uses relational operators to display whether
 * the first number is greater, less than or equal to the second number */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two numbers: ");
        int v = scanner.nextInt();
        int q = scanner.nextInt();
        if (v > q) {
            System.out.println("Numarul " + v + " este mai mare decat " + q);
        } else if (v < q) {
            System.out.println("Numarul " + v + " este mai mic decat " + q);
        } else {
            System.out.println("Numerele 6" + v + " si " + q + " sunt egale");
        }
/** Challenge 7. Write a program where you perform operations between an integer and a double. Display the result */
        int k = 10;
        double l = 12.5;
        System.out.println("int k + double l = " + (k + l));
        System.out.println("int k - double l = " + (k - l));
        System.out.println("int k / double l = " + (k / l));
        System.out.println("int k * double l = " + (k * l));
        System.out.println("int k % double l = " + (k % l));

/** Challlenge 8.Create a program that takes two byte values adds them together, and stores the result in a byte variabile*/
        byte byte1 = 2;
        byte byte2 = 3;
        byte byteSum = (byte) (byte1 + byte2);
        System.out.println("Suma dintre byte1 si byte2 este " + byteSum);

/** Challenge 9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs*/
        int Length = 10;
        double Breadth = 12.3;
        System.out.println("The area of a rectangle is " + (Length * Breadth));

/** Challenge 10.Write a program that reverses the sign of an entered integer using unary minus operator*/
        int originalNumber = 101;
        int reversedNumberSign = -(originalNumber);
        System.out.println("Original number is " + originalNumber);
        System.out.println("Reversed number is " + reversedNumberSign);

/** Challenge 11.Write a Java program that takes two boolean imputs from a user Apply the logical negation
 * operator(!) to each to print the result */
        boolean variabila1 = true;
        boolean variabila2 = false;
        variabila1 = !(variabila1);
        variabila2 = !(variabila2);
        System.out.println(variabila1);
        System.out.println(variabila2);

/**Challenge 12.Create a program that takes an integer as input and then increments and decrements it by 1,
 * displaying the output at each stage*/
        int id = 4;
        System.out.println(id);
        System.out.println(++id);
        System.out.println(id++);
        System.out.println(--id);
        System.out.println(--id);

/**Challenge 13.Write a program to calculate the price after discount. Take the original price and discount
 *  percentage as input. Use compound assignment operator to perform the calculation */
        int originalPrice1 = 120;
        int discount1 = 20;
        originalPrice1 -= ((discount1 * 100) / originalPrice1);
        System.out.println("The price after discount is " + originalPrice1);

/** Challenge 14.Create a program that checks  if a user entered number is within a specific range (e.g. 1 - 100)
 * Use relational operators for the checks  */
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int numarIntrodus = scanner1.nextInt();
        if (numarIntrodus >= 1 && numarIntrodus <= 100) {
            System.out.println("Numarul introdus " + numarIntrodus + " se afla intre campul de numere de la 1  100");
        } else {
            System.out.println("Numarul introdus " + numarIntrodus + " nu apartine campului de numere intre 1 si 100");
        }
    }
}
