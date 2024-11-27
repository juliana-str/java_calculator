import java.util.*;

public class Main {

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
            Calculator.calculator(value1, value2, action);
        } else {
            System.out.println("Введите число - размер массива слов.");
            int arrayLenth = scanner.nextInt();
            ArrayList<String> words = new ArrayList<>();
            for (int i = 1; i <= arrayLenth; i++) {
                System.out.println("Введите " + i + " слово.");
                String word = scanner.next();
                words.add(word);
            }
            FindMaxElement.findMaxElement(words, arrayLenth);
        }
        scanner.close();
    }
}
