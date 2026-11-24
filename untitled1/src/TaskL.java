import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // убираем все пробелы
        String input = scanner.nextLine().replaceAll("\\s+", "");

        char operator = ' ';
        int operatorIndex = -1;

        // Ищем знак
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1) {
            System.out.println("Ошибка: не найден знак операции (+, -, *, /)");
            return;
        }


        double num1 = Double.parseDouble(input.substring(0, operatorIndex));
        double num2 = Double.parseDouble(input.substring(operatorIndex + 1));
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                result = num1 / num2;
                break;
        }

        System.out.println("Результат: " + result);
    }
}
