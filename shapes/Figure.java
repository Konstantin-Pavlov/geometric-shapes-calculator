package Task22.shapes;

import Task22.shapes.exceptions.NegativeValueException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Figure implements Shape {
    public Figure() {
        input();
    }

    protected abstract void input();

    protected double askUserInput(InputChecker checker, String message, char fillCharacter) {
        System.out.print(message);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String inp = scanner.nextLine();
        String inp = null;
        try {
            inp = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            checker.checkInput(inp);
        } catch (NegativeValueException | NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("StackTrace message: ");
            e.printStackTrace();
            oneSecondPause(); // иначе вывод немного перемешается
            drawLine('-', 50, true);
            return askUserInput(checker, message, fillCharacter);
        }
        return Double.parseDouble(inp);
    }

    private void oneSecondPause() {
        try {
            Thread.sleep(1000); // Остановка выполнения программы на 1 секунду
        } catch (InterruptedException i) {
            // Обработка исключения, если поток был прерван
            i.printStackTrace();
        }
    }

    private void drawLine(char fillCharacter, int times, boolean tabulation) {
        if (tabulation) {
            System.out.print("\n\t\t");
        }
        for (int i = 0; i < times; i++) {
            System.out.print(fillCharacter);
        }
        System.out.println("\n");
    }
}
