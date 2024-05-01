import java.lang.Math;

class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
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

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, String color) {
        super(color);
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

public class Main {
    public static void main(String[] args) {
        // Circle
        Circle circle = new Circle(5, "Red");
        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Circle Area: " + circle.calculateArea());

        // Rectangle
        Rectangle rectangle = new Rectangle(4, 6, "Blue");
        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Triangle
        Triangle triangle = new Triangle(3, 4, "Green");
        System.out.println("Triangle Color: " + triangle.getColor());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
