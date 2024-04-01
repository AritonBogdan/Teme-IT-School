public class Rectangle {

    private double width;
    private double heigth;
/**Defaylt construct*/
    public Rectangle() {
        this.width = 1;
        this.heigth = 1;
    }
/**Constructor with specified width and height*/
    public Rectangle(double width, double length) {
        this.width = width;
        this.heigth = length;
    }
/**Method for AREA*/
    public double getArea() {
        return width * heigth;
    }
/**Method for PERIMETER*/
    public double getPerimeter() {
        return 2 * (width + heigth);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return heigth;
    }

    public void setLength(double length) {
        this.heigth = length;
    }
}
