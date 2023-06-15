import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // алгоритм сортировки слиянием
        int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
        int[] result = MergSort.mergeSort(array1);
        System.out.println("Результирующий массив: " + Arrays.toString(result));
        System.out.println("#####################################################################");
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> intlist = MyList.CreateMylist();
        MyList.DelEvenNum(intlist);
        System.out.println("#####################################################################");
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // среднее из этого списка.

        List<Integer> numblist = MyListMaxMin.CreateMylist();
         MyListMaxMin.MaxInList(numblist);
          MyListMaxMin.MinInList(numblist);
           MyListMaxMin.AverInList(numblist);
           

    }

}
