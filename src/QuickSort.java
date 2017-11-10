public class QuickSort {
    private QuickSort(){
    }
    public static void qsort(int arr[]){
        qs(arr, 0, arr.length);
    }
    private static void qs(int arr[], int left, int right){
        left = 0;
        right = arr.length - 1;
        int comparator = arr[arr.length >>> 1];
        int i = left;
        int j = right;
        int temp;

        do{
            while((arr[i] < comparator)&&(i < right))i++;
            while((arr[j] > comparator)&&(j > left))j--;

            if(i <= j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
        }while(i <= j);
        if(i < right)qs(arr, i, right);
        if(j > left)qs(arr, left, i);
    }
}
