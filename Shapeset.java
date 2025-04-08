import java.util.Scanner;

interface Shapes {
    void area();
    void perimeter();
}

class Circle implements Shapes {
    double radius;

    public void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * 3.14 * radius));
    }
}

class Rectangle implements Shapes {
    double length, breadth;

    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}

public class Shapeset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        while (true) {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter radius: ");
                c.radius = sc.nextDouble();
                c.area();
                c.perimeter();
            } else if (ch == 2) {
                System.out.print("Enter length: ");
                r.length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                r.breadth = sc.nextDouble();
                r.area();
                r.perimeter();
            } else if (ch == 3) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

       
    }
}
