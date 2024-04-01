public class Tema18_19 {
    public static void main(String[] args) {

/** Design a class named Rectangle that contains:

 Two private double data fields named width and height that specify the width and height of the rectangle.
 The default values are 1 for both width and height.
 A no-arg constructor that creates a default rectangle.
 A constructor that creates a rectangle with the specified width and height.
 A method named getArea() that returns the area of this rectangle.
 A method named getPerimeter() that returns the perimeter.*/

        Rectangle rectangle = new Rectangle(4,5);

        System.out.println("Rectangle 1: ");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

    }
}
