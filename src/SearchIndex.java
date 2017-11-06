import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchIndex {
    public static void main(String args[]) throws Exception{
        int numberOfArray, number;
        System.out.print("Введите положительное количество элементов массива отличное от 0:\t");
        numberOfArray = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()); // Получаем с консоли количество элементов масива.
        int array[] = new int[numberOfArray];
        while(numberOfArray==0){
            System.out.println("Не существует нулевых массивов, в масиве должен присутствовать хотя бы 1 элемент, повторите, пожалуйста, ввод!");
            numberOfArray = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        }
        System.out.println("Вводите элементы будущего массива:");
        for(int i = 0; i < numberOfArray; i++){
            array[i] = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()); // Заполняем цыклом элементы массива.
        }
        BubbleSort.bubbleSort(array); // сортируем "пузырьком".

        System.out.println();
        System.out.println("Введите искомое число:\t");
        number = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        BinarySearch.binSearch(array, number, 0, numberOfArray);// бинарный поиск индекса эелемента.
    }
}
