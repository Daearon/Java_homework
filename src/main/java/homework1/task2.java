package homework1;
import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        int number = 1000;
        List<Integer> simple_number = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            boolean isSimpleNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimpleNumber = false;
                    break;
                }
            }

            if (isSimpleNumber) {
                simple_number.add(i);
            }
        }
        System.out.println("Простые числа: " + simple_number);
    }
}
