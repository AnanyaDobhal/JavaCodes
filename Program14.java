import java.util.Scanner;
interface Volume {
    double calculateVolume();
}

class Cone implements Volume {
    private double radius;
    private double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double calculateVolume() {
        return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }
}
class Hemisphere implements Volume {
    private double radius;

    public Hemisphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (2.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

class Cylinder implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the cone: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Enter height of the cone: ");
        double coneHeight = scanner.nextDouble();

        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Volume of the cone: " + cone.calculateVolume());

        System.out.print("Enter radius of the hemisphere: ");
        double hemiRadius = scanner.nextDouble();

        Hemisphere hemisphere = new Hemisphere(hemiRadius);
        System.out.println("Volume of the hemisphere: " + hemisphere.calculateVolume());

        System.out.print("Enter radius of the cylinder: ");
        double cylRadius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double cylHeight = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
        System.out.println("Volume of the cylinder: " + cylinder.calculateVolume());
        scanner.close();
    }
}
