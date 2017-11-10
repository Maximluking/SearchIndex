import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String args[]) throws Exception{
        Random rnd = new Random();
        int array[] = new int[30];
        for(int i = 0; i < array.length; i++)array[i] = rnd.nextInt(30);
        //int array[] = {21, 0, 3, 0, 19, 26, 6, 0, 22, 1, 17, 15, 3, 17, 4, 15, 10, 14, 24, 29, 0, 7, 23, 15, 2, 15, 3, 21, 27, 19};
        System.out.println(Arrays.toString(array));

        QuickSort.qsort(array);
        System.out.println(Arrays.toString(array));
    }
}
