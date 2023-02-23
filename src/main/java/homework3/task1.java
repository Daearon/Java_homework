package homework3;

public class task1 {
    int[] array;
    int[] tempArray;
    int length;

    public static void main(String[] args) {
        int[] sortedArray = { 11, 5, 16, 31, 1, 98, 7, 9, 3 };
        task1 arr = new task1();
        arr.sort(sortedArray);
        System.out.print("Сортированный список: ");
        for (int i : sortedArray) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("\nДлина списка - " + sortedArray.length);
    }

    public void sort(int[] sortedArray) {
        this.array = sortedArray;
        this.length = sortedArray.length;
        this.tempArray = new int[length];
        Merge_Sort(0, length - 1);
    }

    public void Merge_Sort(int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            Merge_Sort(low, mid);
            Merge_Sort(mid + 1, high);
            Merge(low, mid, high);
        }
    }

    public void Merge(int low, int mid, int high) {
        if (high + 1 - low >= 0)
            System.arraycopy(array, low, tempArray, low, high + 1 - low);
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }

            k++;
        }
        while (i <= mid) {
            array[k] = tempArray[i];
            i++;
            k++;
        }
    }
}
