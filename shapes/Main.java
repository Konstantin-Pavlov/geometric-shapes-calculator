package Task22.shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);

        Sphere sphere = new Sphere(scanner);
        System.out.println("площадь сферы: " + sphere.getArea());
        System.out.println("объём сферы: " + sphere.getVolume());
        System.out.println();

        Parallelepiped parallelepiped = new Parallelepiped(scanner);
        System.out.println("площадь параллелепипеда: " + parallelepiped.getArea());
        System.out.println("объём параллелепипеда: " + parallelepiped.getVolume());
        System.out.println();

        Cylinder cylinder = new Cylinder(scanner);
        System.out.println("площадь цилиндра: " + cylinder.getArea());
        System.out.println("объём цилиндра: " + cylinder.getVolume());
        System.out.println();

        Cone cone = new Cone(scanner);
        System.out.println("площадь конуса: " + cone.getArea());
        System.out.println("объём конуса: " + cone.getVolume());
        System.out.println();

        scanner.close();
    }
}
