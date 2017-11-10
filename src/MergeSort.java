import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class MergeSort {
    private MergeSort(){
    }
    public static void mergeSort (int arr[]){
        sort(arr, 0, arr.length);
    }
    private static void sort(int arr[], int left, int right){
        right = arr.length;
        if((arr.length > 2)){
            int bufL[], bufR[];
            int comparator = arr.length >>> 1;
            bufL = copyOfRange(arr, 0, comparator);
            bufR = copyOfRange(arr, comparator, right);
            sort(bufL, 0, comparator);
            System.out.println(Arrays.toString(bufL));
            sort(bufR, comparator + 1, right);
            System.out.println(Arrays.toString(bufR));
            //MergeSort.merge(bufL, bufR);

        }
    }
    private static int[] merge(int bufL[], int bufR[]){
        int buf[] = new int[bufL.length + bufR.length];
        int i = 0, j = 0, k = 0;
        while((i <= bufL.length)&(j <= bufR.length)){

                    if (bufL[i] < bufR[j]){
                    buf[k] = bufL[i];
                    i++;
                } else if(bufL[i] > bufR[j]){
                    buf[k] = bufR[j];
                    j++;
                }
                k++;
        }
        return buf;
    }
}
