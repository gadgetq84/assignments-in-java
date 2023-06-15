import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class MyListMaxMin {
    //Генерируем наш лист 
    public static List<Integer> CreateMylist() {
        Random rnd = new Random();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            // заполняем значениями
            numList.add(rnd.nextInt(20));
        }
        System.out.println("Исходный массив: " + numList);
        return numList;
    }

    public static void MinInList(List<Integer> lst) {
        int min = Collections.min(lst);
        System.out.println("Минимальное значение: " + min);
    }

    public static void MaxInList(List<Integer> lst) {
        int max = Collections.max(lst);
        System.out.println("Максимальное значение: " + max);
    }

    public static void AverInList(List<Integer> lst) {
        //Среднее арифметическое значение: 
        OptionalDouble average = IntStream.of(lst.stream().mapToInt(Integer::intValue).toArray()).average();
        // запишем в эту перемменную наиболее подходящие значения из массива
        int bestaverage = Integer.MAX_VALUE;
        //Ищем значение в листе ближайшее к среднему арифметическому: 
        for (Integer item : lst) {
            if (Math.abs(item - average.getAsDouble()) < Math.abs(bestaverage - average.getAsDouble())) {
                bestaverage = item;
            }
        }
        System.out.println("Среднее арифметическое значение: " + average.getAsDouble());
        System.out.println("Среднее ближайшее значение: " + bestaverage);
    }

}
