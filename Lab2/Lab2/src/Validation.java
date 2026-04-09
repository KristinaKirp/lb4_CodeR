import java.util.Scanner;

public class Validation {

    public static int inputInteger(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                int value = input.nextInt();
                input.nextLine();
                return value;
            } else {
                System.out.println("Ошибка ввода!");
                input.next();
            }
        }
    }

    public static double inputDouble(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                double value = input.nextDouble();
                input.nextLine();
                return value;
            } else {
                System.out.println("Ошибка ввода!");
                input.next();
            }
        }
    }

    public static int inputMark(Scanner input, String prompt) {
        while (true) {
            int value = inputInteger(input, prompt);
            if (value >= 1 && value <= 5) {
                return value;
            }
            System.out.println("Оценка должна быть от 1 до 5");
        }
    }

    //FIX_ME: добавлен метод для ввода строки
    public static String inputString(Scanner input, String prompt) {
        System.out.print(prompt);
        String value = input.nextLine();
        while (value.isEmpty()) {
            System.out.println("Ошибка: строка не может быть пустой. Повторите ввод.");
            System.out.print(prompt);
            value = input.nextLine();
        }
        return value;
    }
}