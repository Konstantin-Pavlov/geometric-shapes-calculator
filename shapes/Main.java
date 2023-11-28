package Task22.shapes;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Sphere sphere = new Sphere();
        System.out.println("площадь сферы: " + sphere.getArea());
        System.out.println("объём сферы: " + sphere.getVolume());
        System.out.println();

        Parallelepiped parallelepiped = new Parallelepiped();
        System.out.println("площадь параллелепипеда: " + parallelepiped.getArea());
        System.out.println("объём параллелепипеда: " + parallelepiped.getVolume());
        System.out.println();

        Cylinder cylinder = new Cylinder();
        System.out.println("площадь цилиндра: " + cylinder.getArea());
        System.out.println("объём цилиндра: " + cylinder.getVolume());
        System.out.println();

        Cone cone = new Cone();
        System.out.println("площадь конуса: " + cone.getArea());
        System.out.println("объём конуса: " + cone.getVolume());
        System.out.println();
    }
}
