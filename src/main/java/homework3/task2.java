package homework3;
import java.util.ArrayList;
import java.util.Random;
public class task2 {
    public static ArrayList<Integer> GetRandomArray(int number) {
        ArrayList<Integer> newArray = new ArrayList<>(number);
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            newArray.add(random.nextInt(0,11));
        }
        return newArray;
    }


    public static void main(String[] args){
        ArrayList<Integer> nArray =  GetRandomArray(10);
        System.out.println(nArray);
        for (int i = nArray.size()-1; i >= 0; i--) {
            if(nArray.get(i)%2 == 0){
                nArray.remove(i);
            }
        }
        System.out.println(nArray);
    }
}
