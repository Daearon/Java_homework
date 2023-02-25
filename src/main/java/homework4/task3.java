package homework4;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class task3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(4);
        System.out.println("Перечень элементов списка: " + list);
        System.out.println("Сумма элементов списка: " + findSum(list));
    }
    public static <T extends Number> double findSum(List<T> list) {
        Iterator<T> it = list.iterator();
        double result = 0;
        while (it.hasNext())
            result += it.next().doubleValue();
        return result;
    }
}
