abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
    public double perimeter() { return 2 * Math.PI * radius; }
}

class Rectangle extends Shape {
    private double length, width;
    public Rectangle(double length, double width) { this.length = length; this.width = width; }
    public double area() { return length * width; }
    public double perimeter() { return 2 * (length + width); }
}

class Triangle extends Shape {
    private double a, b, c;
    public Triangle(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double perimeter() { return a + b + c; }
}

public class p9 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle - Area: " + circle.area() + ", Perimeter: " + circle.perimeter());
        System.out.println("Rectangle - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
        System.out.println("Triangle - Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());
    }
}
