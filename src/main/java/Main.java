import java.util.Scanner;

public class Main {
    /**
     *
     * @param value1 first value
     * @param value2 second value
     * @param action action to calculate only +, -, *, /
     */
    public static void calculator(double value1, double value2, String action) {
        double result = 0;
        switch (action) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                result = value1 / value2;
        }
        System.out.printf(String.format("Результат вычисления %.4f", result));
    }

    /**
     * @author Strelnikova Juliana
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите первое число.");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();
        System.out.println("Введите второе число.");
        double value2 = scanner.nextDouble();
        System.out.println("Пожалуйста введите необходимое действие.");
        String action = scanner.next();
        scanner.close();
        calculator(value1, value2, action);
    }
}
