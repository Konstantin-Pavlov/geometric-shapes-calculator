package Task22.shapes;

import java.util.Scanner;

public class Cone extends Figure {
    private double h;
    private double radius;

    public Cone(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void input(Scanner scanner) {
        InputChecker checker = new InputChecker();
        System.out.println(" -----  конус  -----\n");
        this.h = askUserInput(scanner, checker, "Введите h (высота): ", '-');
        this.radius = askUserInput(scanner, checker, "Введите радиус: ", '-');
    }

    @Override
    public double getArea() {
        // l (образующая)
        double l = Math.sqrt(Math.pow(radius, 2) + Math.pow(h, 2));
        return Math.PI * Math.pow(radius, 2) + Math.PI * radius * l;
    }

    @Override
    public double getVolume() {
        return 1D / 3 * Math.PI * Math.pow(radius, 2) * h;
    }
}
