package homework1;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input your first number: ");
        int i = iScanner.nextInt();
        int triangle = (i * (i + 1)) / 2;
        System.out.printf("Треугольное число: %d\n", triangle);
        iScanner.close();
    }
}