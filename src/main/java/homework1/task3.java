package homework1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input your first number: ");
        int i = iScanner.nextInt();
        Scanner jScanner = new Scanner(System.in);
        System.out.print("Input your second number: ");
        int j = jScanner.nextInt();
        Scanner opScanner = new Scanner(System.in);
        System.out.print("Input your operator(+, -, *, /): ");
        char op = opScanner.next().trim().charAt(0);
        System.out.print(calculation(i, j, op));

    }
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result = 0;
        switch (operator) {
            case '*' -> result = firstOperand * secondOperand;
            case '+' -> result = firstOperand + secondOperand;
            case '-' -> result = firstOperand - secondOperand;
            case '/' -> {
                if (secondOperand == 0) {
                    throw new ArithmeticException("Division by zero is not possible");
                }
                result = firstOperand / secondOperand;
            }
        }

        return result;
    }
}
