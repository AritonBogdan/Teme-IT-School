public class Challengescurs3 {
    public static void main(String[] args) {
//        Binary Arithmetic Operators
        /** Write a JAVA program to take two numbers as input and display the result of addition,
         *  subtraction, multiplication, division and modulus*/
        int x = 4, y = 2;
//        System.out.println("Addition x+y= " + (x + y));
//        System.out.println("Subtraction x-y= " + (x - y));
//        System.out.println("Multiplication x*y= " + (x * y));
//        System.out.println("Division x/y= " + (x / y));
//        System.out.println("Modulus x%y= " + (x % y));
//        /**Write a program that calculates the area of the rectangle*/
//        int L = 3;
//        double l = 5.2;
//        System.out.println("Area of rectangle is " + (L * l));

//        Unary Operations
        /**Create a Java program whre you increment and decrement the same variable
         * Display the value of the variable after each operation */
//        int variabila = 4;
//        System.out.println(++variabila);
//        System.out.println(variabila);
//        System.out.println(--variabila);
        /**Write a program that reverse the sign of an entered integer using unary minus operator*/
//        int variabila1 = 4;
//        int variabila2 = -(variabila1); /** Varianta 1 */
//        System.out.println("The number with reversed sign is "+ variabila2);
//        System.out.println(-(variabila1)); /** Varianta 2 */

//        Logical Complement and Negation Operators
        /** Write a program to check if a number is positive or negative using logical complement operator*/
        /**Varianta 1*/
//        double a = 1;
//        if (a > 0.001){
//            System.out.println("The number is positive.");
//        } else{
//            System.out.println("The number is negative.");
//        }
        /**Varianta 2*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert a number: ");
//        int number = scanner.nextInt();
//        boolean numarPozitiv = !(number < 0);
//        if (numarPozitiv) {
//            System.out.println("The number is positive.");
//        } else {
//            System.out.println("The number is negative.");
//        }
        /**Write a Java program that takes 2 boolean inputs from a user*/
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Insert number one: ");
//        System.out.println("Insert number two: ");
//        int number1 = scanner1.nextInt();
//        int number2 = scanner1.nextInt();
        /** Apply the logical negation operator (!) to each and print the result */
//        boolean numar1 = !(number1 > 2);
//        boolean numar2 = !(number2 < 3);
//        System.out.println(numar1);
//        System.out.println(numar2);

//        Increment and Decrement Operators
        /**Write a Java program that uses  both the increment (++) and decrement(--) operators
         * in a loop to count up to 10 and then back down to 1*/
        /**Create a program that takes an integer as input an then increments  and decrements it by 1,
         * displaying the output at each stage*/
//        int numarX = 0;
//        System.out.println(numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(++numarX);
//        System.out.println(numarX);
//        System.out.println(--numarX);
//        System.out.println(--numarX);
//        System.out.println(--numarX);
//        System.out.println(--numarX);
//        System.out.println(--numarX);
//        System.out.println(--numarX);
//        System.out.println(--numarX);
//        System.out.println(--numarX);
//        System.out.println(--numarX);


//        Assignment and Compound Assignment Operators
        /** Create a Java program that demonstrates the use of each compound assignment operator with integers*/
//        int b = 10, n = 5;
//        b = b * n; /** 10 * 5 = 50 */
//        b += 3; /** 50 + 3 = 53 */
//        n -= 2; /** n = 3 */
//        b = b * n; /** 53 * 3 = 159 */
//        System.out.println(b);
//        System.out.println(n);
        /** Create a program to calculate the price after discount. Take the original price
         * and discount percentage as input. Use compound assignment operator to perform the calculation*/
//        double P = 100, D = 20;
//        D = (D * 100 / P);
//        P = P - D;
//        System.out.println(P);


//        Relational Operators
        /** Write a Java program that takes two numbers from the user relational operators to display whether
         * the first number is greater than, less than, or equal to the second number.*/
//        int o = 5, p = 9;
//        System.out.println(o >= p);
//        System.out.println(o <= p);
        /**Create a program that checks if a user entered number is within specific range. (e.g. 1 - 100)
         * Use specific relational operators for the checks.*/
//        int xx = 22;
//        if(xx >= 1 && xx <= 100){
//            System.out.println("The number "+ xx +" is within the range");
//        }else {
//            System.out.println("The number "+ xx +" is not in the range");
//        }


//        Numeric Promotion
        /** Write a program where you perform operations between an integer on a double.
         * Display the result and discuss why it is in that format (due to Numeric Promotion) */
//        int g = 2;
//        double f = 6;
//        System.out.println(g * f); // Rezultatul este double deoarece conform numeric promotion double este mai mare!
        /** Create a program that takes two byte values, adds them together, and stores the result in a byte variabile
         * Explain why the result is or isn't what you'd expected, based on the rules on the numeric promotion.*/
        long u = 33, i = 55;
//        byte t = u + i; /** java: incompatible types: possible lossy conversion from long to byte */
//        System.out.println(t); /** java: incompatible types: possible lossy conversion from long to byte */
        System.out.println(u+i);


    }
}
