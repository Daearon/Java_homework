package homework4;
import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(8);
        queue.add(4);
        queue.add(10);

        System.out.println(queue);
        System.out.println(queue);
        queue.offer(54);
        System.out.println(queue);
        System.out.println(queue);
        System.out.println(queue);
        queue.add(100);
        enqueue(queue);
        System.out.println(queue);
        dequeue(queue);
        System.out.println(queue);
        initial(queue);
        System.out.println(queue);
    }

    private static void initial (Queue<Integer> queue) {
        System.out.println(queue.peek());
    }
    private static void dequeue(Queue<Integer> queue) {
        System.out.println(queue.poll());
    }

    private static void enqueue(Queue<Integer> queue) {
        queue.add(null);
    }
}
