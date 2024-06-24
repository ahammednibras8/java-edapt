package shapes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1-Circle\n2-Rectangle\n3-Triangle");
        System.out.println("Enter the shape number: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Circle circle = new Circle();
                circle.area();
                circle.perimeter();
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.area();
                rectangle.perimeter();
                break;
            case 3:
                Triangle triangle = new Triangle();
                triangle.area();
                triangle.perimeter();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}

class Shape {
    Scanner input = new Scanner(System.in);

    void area(){
        System.out.println("Area: ");
    }
    void perimeter(){
        System.out.println("Perimeter: ");
    }
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Enter the radius of circle: ");
        float radius = input.nextFloat();

        System.out.println("Area: " + Math.PI * radius * radius);
    }
    @Override
    void perimeter() {
        System.out.println("Enter the radius of circle: ");
        float radius = input.nextFloat();

        System.out.println("Perimeter: " + 2 * Math.PI * radius);
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Enter the length: ");
        float length = input.nextFloat();
        System.out.println("Enter the breadth: ");
        float breadth = input.nextFloat();

        System.out.println("Area: " + length * breadth);
    }
    @Override
    void perimeter() {
        System.out.println("Enter the length: ");
        float length = input.nextFloat();
        System.out.println("Enter the breadth: ");
        float breadth = input.nextFloat();

        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}

class Triangle extends Shape {
    @Override
    void area() {
        System.out.println("Enter the length of base: ");
        float base = input.nextFloat();
        System.out.println("Enter the height: ");
        float height = input.nextFloat();

        System.out.println("Area: " + 0.5 * base * height);
    }
    @Override
    void perimeter() {
        System.out.println("Enter the length of first side: ");
        float side1 = input.nextFloat();
        System.out.println("Enter the length of second side: ");
        float side2 = input.nextFloat();
        System.out.println("Enter the length of third side: ");
        float side3 = input.nextFloat();

        System.out.println("Perimenter: " + side1 + side2 + side3);
    }
}