import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyList {
    //Генерируем наш лист 
    public static  List<Integer> CreateMylist() {
        Random rnd = new Random();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            // заполняем значениями
            numList.add(rnd.nextInt(15));
        }
        System.out.println("Исходный массив: "+numList);
        return numList;
    }

    public static void DelEvenNum(List<Integer> lst) {
        List<Integer> swap = new ArrayList<>();
        for (Integer item: lst) {
            if (item % 2 == 0) {
                swap.add(item);
            }
        }
        System.out.println("Элементы которые нужно удалить: "+swap);
        lst.removeAll(swap);
        System.out.println("Результирующий массив: "+lst);
    }

}
