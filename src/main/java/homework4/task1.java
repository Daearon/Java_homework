package homework4;
import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(createRandomList());
        }
        System.out.println(list);
        System.out.println(reversal(list));
    }

    public static int createRandomList() {
        double randomNumber = (Math.random() * 100);
        return (int) randomNumber;
    }

    private static List<Integer> reversal(LinkedList<Integer> list) {
        List<Integer> reversal = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversal.add(list.get(i));
        }
        return reversal;
    }
}
