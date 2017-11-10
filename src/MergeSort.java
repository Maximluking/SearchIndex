public class MergeSort {
    private MergeSort(){
    }

    public static void sort (int arr[], int leftB, int rightB){
        if(arr.length > 2) {
            leftB = 0;
            rightB = arr.length;
            int middle = arr.length/2;// лучше использовать ">>>1".
            int arrLeft[] = new int[middle]; // создаем вспомогательынй массив "Левая часть"
            if((arrLeft.length == 2)&&(arr[leftB] > arr[leftB + 1])){ // если во дочернем массиве - 2 элемента, то сразу сортируем по возрастанию.
                arrLeft[0] = arr[leftB + 1];
                arrLeft[1] = arr[leftB];}
            else {for(int i = 0; i < arr.length/2; i++) { // Если в родительском массиве > 2 элементов, набиваем дочерний половинной из родительского.
                arrLeft[i] = arr[i];
            }
            }
            int arrRight[] = new int[rightB - middle]; // По аналогии с левой частью формируем правый дочерний массив.
            if((arrRight.length == 2)&&(arr[middle] > arr[middle + 1])){
                arrRight[0] = arr[middle + 1];
                arrRight[1] = arr[middle];
            }
            else {for(int j = 0; j < arrRight.length; j++){
                arrRight[j] = arr[middle + j];
            }
            }

            for(int i:arrLeft) System.out.print(i + " "); // для понимания правильности сортировки и деления на подмассивы.
            System.out.println();
            for(int j:arrRight) System.out.print(j + " ");
            System.out.println();

            sort(arrLeft, leftB, middle);
            sort(arrRight, middle, rightB);

        }
    }

    /* static int[] merge(int left[], int right[]){

        int arr[] = new int[left.length + right.length];
        for(int i = 0; i < arr.length; i++) {
            int l  = 0;
            int r = 0;
            if(right[r] < left[l]){
                arr[i] = right[l];
                r++;
            } else if (right[r] > left[l]){
                arr[i] = left[r];
                r++;
            }
        }
        return arr;
     }*/
}
