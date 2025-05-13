import java.util.Scanner;

abstract class Shape {
    abstract void rectangleArea(int length, int width);

    abstract void squareArea(int side);

    abstract void circleArea(double radius);
}

public class Program12 extends Shape {
    void rectangleArea(int length, int width) {
        int area = length * width;
        System.out.println("Rectangle Area: " + area);
    }

    void squareArea(int side) {
        int area = side * side;
        System.out.println("Square Area: " + area);
    }

    void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape ar = new Program12();
        System.out.println("Enter length and width of rectengle: ");
        int len = sc.nextInt();
        int wid = sc.nextInt();
        ar.rectangleArea(len, wid);
        System.out.println("Enter Side of square: ");
        int side = sc.nextInt();
        ar.squareArea(side);
        System.out.println("Enter radius of circle: ");
        double r = sc.nextDouble();
        ar.circleArea(r);
        sc.close();
    }
}
