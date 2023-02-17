package homework2;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) {
        int[] number_array = {6,2,4,0,8,23,1,7,11,9};

        try {
            System.out.println(Arrays.toString(bubbleSort(number_array)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int[] bubbleSort(int[] array) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("C:\\Users\\alexa\\OneDrive\\Desktop\\Java. Homework\\HW1\\Homework_1\\src\\main\\java\\homework2/log_task2.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        boolean sorted = false;
        while (!sorted){
            for (int i = 0; i < array.length-1; i++) {
                sorted = true;
                if (array[i] > array[i+1]){
                    sorted = false;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
                logger.log(Level.INFO, Arrays.toString(array));
            }
        }
        return array;
    }
}
