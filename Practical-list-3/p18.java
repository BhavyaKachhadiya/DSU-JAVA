// Shape interface
public interface Shape {
    double getArea();
    double getPerimeter();
}

// Circle class implementing the Shape interface
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class to test the Circle class
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
    }
}
