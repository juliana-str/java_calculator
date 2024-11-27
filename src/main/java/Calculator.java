public class Calculator {
    /**
     * @param value1 first value
     * @param value2 second value
     * @param action action to calculate only +, -, *, /
     */
    public static void calculator(double value1, double value2, String action) {
        double result;
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

}
