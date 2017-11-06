public class BinarySearch {

    private BinarySearch(){
    }

    public static void binSearch(int arr[], int key, int leftBorder, int rightBorder) {
        int middle;
        middle = (leftBorder + (rightBorder - leftBorder)/2);
        if(rightBorder < leftBorder){
            System.out.println("Искомого занчения нет в массиве.");
        } else if(key == arr[middle]){
            System.out.println("Индекс искомого значения - " + (middle));
        } else if (key > arr[middle]){
            binSearch(arr, key, middle + 1, rightBorder);
        } else {binSearch(arr, key, leftBorder, middle-1);}
    }
}