import java.lang.Math;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculatePerimeter() {
        // For simplicity, assuming it's an equilateral triangle
        // In general, perimeter calculation can be more complex based on the type of triangle
        // For equilateral triangle, all sides are equal, so perimeter = 3 * base
        return 3 * base;
    }
}

public class p10 {
    public static void main(String[] args) {
        // Circle
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Rectangle
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Triangle
        Triangle triangle = new Triangle(3, 4);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
