package func.Q2;

import java.util.Scanner;
import utilities.ShapeUtilis.Mensuration;

class Shapes {
    String type;
    double area;
    double perimeter;

    public void displayInfo() {
        System.out.println("The shape is a " + type +", the area is " + area +", and the perimeter is " + perimeter);
    }
}

class Circle extends Shapes implements Mensuration {
    double radius;

    Circle(double radius) {
        this.type = "Circle";
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shapes implements Mensuration {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.type = "Rectangle";
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double Area() {
        return length * breadth;
    }

    @Override
    public double Perimeter() {
        return 2 * (length + breadth);
    }
}

public class ShapesImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the length of the Rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the Rectangle: ");
        double breadth = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.area = circle.Area();
        circle.perimeter = circle.Perimeter();
        circle.displayInfo();

        System.out.println(); // line break

        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.area = rectangle.Area();
        rectangle.perimeter = rectangle.Perimeter();
        rectangle.displayInfo();

        sc.close();
    }
}
