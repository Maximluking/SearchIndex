public class BinarySearch {
    private BinarySearch(){
    }
    public static void binSearch(int arr[], int key, int left, int right) {
        int mid;
        mid = arr.length >>> 1;
        if(right < left){
            System.out.println("Искомого занчения нет в массиве.");
        } else if(key == arr[mid]){
            System.out.println("Индекс искомого значения - " + (mid));
        } else if (key > arr[mid]){
            binSearch(arr, key, mid + 1, right);
        } else {binSearch(arr, key, left, mid-1);}
    }
}