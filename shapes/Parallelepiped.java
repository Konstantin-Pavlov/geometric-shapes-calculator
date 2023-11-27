package Task22.shapes;

import Task22.shapes.exceptions.NegativeValueException;

import java.util.Scanner;

public class Parallelepiped extends Figure {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(Scanner scanner) {
        super(scanner);
    }

    @Override
    public double getArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }


    @Override
    protected void input(Scanner scanner) {
        InputChecker checker = new InputChecker();

        System.out.println(" -----  параллелепипед  -----\n");

        this.length = askUserInput(scanner, checker, "Введите длину: ", '-');
        this.width = askUserInput(scanner, checker, "Введите ширину: ", '-');
        this.height = askUserInput(scanner, checker, "Введите высоту: ", '-');

    }

}
