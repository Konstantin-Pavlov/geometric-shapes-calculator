package Task22.shapes;

import Task22.shapes.Figure;
import Task22.shapes.InputChecker;

import java.util.Scanner;

public class Sphere extends Figure {
    private double radius;

    public Sphere(Scanner scanner) {
        super(scanner);
    }


    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getVolume() {
        return 4D / 3 * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    protected void input(Scanner scanner) {
        InputChecker checker = new InputChecker();
        System.out.println(" -----  сфера  -----\n");
        this.radius = askUserInput(scanner, checker, "Введите радиус: ", '-');
    }
}
