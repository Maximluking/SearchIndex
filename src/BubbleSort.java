public class BubbleSort {

    private BubbleSort(){
    }

    public static void bubbleSort(int arr[]) {

        int temp;
        System.out.println("Отсортированный массив в порядке возрастания:");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int k = 0; k < arr.length; k++) System.out.print(arr[k] + " ");
        System.out.println();
    }
}