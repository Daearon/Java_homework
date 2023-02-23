package homework3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class task3 {
    static ArrayList<Integer> create_array() {
        ArrayList<Integer> array = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(rnd.nextInt(0, 10));
        }
        System.out.println(array);
        return array;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = create_array();
        System.out.println("Максимальное число в списке -> " + Collections.max(arr));
        System.out.println("Минимальное число в списке -> " + Collections.min(arr));
        System.out.println("Среднее арифметическое списка -> " + arr.stream().mapToInt(val -> val).average().orElse(0.0));
    }
}
