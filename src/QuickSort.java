public class QuickSort {
    private QuickSort(){
    }
    public static void qsort(int arr[]){
        qs(arr, 0, arr.length - 1);
    }
    private static void qs(int arr[], int left, int right){
        int comparator = arr[(left + right) >>> 1];
        int i = left;
        int j = right;
        int temp;

        for(;;){
            while((arr[i] < comparator)&&(i < right))i++;
            while((arr[j] > comparator)&&(j > left))j--;

            if(i <= j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
            if(i > j)break;
        }
        if(j > left)qs(arr, left, j);
        if(i < right)qs(arr, i, right);
    }
}
