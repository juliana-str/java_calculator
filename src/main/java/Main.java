import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
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
                break;
            default:
                System.out.println("Неверный выбор действия, попробуйте еще раз.");
                return;
        }
        System.out.printf(String.format("Результат вычисления %.4f", result));
    }

    /**
     * @param words list of entered words
     */
    public static void findMaxElement(List<String> words) {
        String maxLenthWord = "";
        for (String word : words) {
            if (word.length() > maxLenthWord.length()) {
                maxLenthWord = word;
            }
        }
        System.out.println(maxLenthWord);
    }

    /**
     * @param args
     * @author Strelnikova Juliana
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задачи  (1 - calculator, 2 - string array).");
        int taskNumber = scanner.nextInt();
        if (taskNumber == 1) {
            System.out.println("Введите первое число.");
            double value1 = scanner.nextDouble();
            System.out.println("Введите второе число.");
            double value2 = scanner.nextDouble();
            System.out.println("Пожалуйста введите необходимое действие.");
            String action = scanner.next();
            calculator(value1, value2, action);
        } else {
            System.out.println("Введите число - размер массива слов.");
            int arrayLenth = scanner.nextInt();
            List<String> words = new ArrayList<>();
            for (int i = 1; i <= arrayLenth; i++) {
                System.out.println("Введите " + i + " слово.");
                String word = scanner.next();
                words.add(word);
            }
            findMaxElement(words);
        }
        scanner.close();
    }
}
