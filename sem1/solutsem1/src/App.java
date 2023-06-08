import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // task1();
        // task2();
        // task3();
        // task4();
        // int task5Res = task5();
        // System.out.println(task5Res);

    }

    private static int task5() {
        String[] array = { "Дом", "Домовой", "Домашний", "Доменный" };
        int res = 0;
        boolean flag = true;
        while (flag) {
            res++;
            for (int x = 0; x < array.length - 1; x++) {
                
                    if ( array[x].length() >= res && array[x].substring(0, res).compareTo(array[x + 1].substring(0, res)) == 0) {

                    } else {
                        res--;
                        flag = false;

                        break;
                    }
                
            }
            
        }
        return res;
    }

    private static void task4() {
        int[] array = { 2, 4, 3, 5, 2, 3, 3, 5, 7, 3, 2 };
        int val = 12;
        int[] newarray = new int[array.length];
        int count = 0;

        for (int x = 0; x < array.length; x++) {
            if (val != array[x]) {
                newarray[count] = array[x];
                count++;
            }
        }
        while (count != array.length) {

            newarray[count] = val;
            count++;
        }
        System.out.println(Arrays.toString(newarray));
    }

    private static void task3() {
        int[] array = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 };
        int count = 0;
        int maxcount = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x] == 1) {
                count++;
            } else {
                if (maxcount <= count) {
                    maxcount = count;
                    System.out.println(count);
                    count = 0;
                }
            }
        }
        if (maxcount < count) {
            maxcount = count;
            count = 0;
        }
        System.out.println(maxcount);
    }

    private static void task2() {
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.printf("Введите свое имя:");
            String name = Scanner.nextLine();
            LocalTime timeOfDay = LocalTime.now();
            System.out.println(timeOfDay);
            if (timeOfDay.getHour() >= 18 && timeOfDay.getHour() < 23) {
                System.out.printf("Добрый вечер, %s!\n", name);
            }
            if (timeOfDay.getHour() >= 12 && timeOfDay.getHour() < 18) {
                System.out.printf("Добрый вечер, %s!\n", name);
            }
            if (timeOfDay.getHour() >= 4 && timeOfDay.getHour() < 12) {
                System.out.printf("Добрый вечер, %s!\n", name);
            }
        }
    }

    private static void task1() {
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.printf("Введите свое имя:");
            String name = Scanner.nextLine();
            System.out.printf("Привет, %s!\n", name);
        }
    }

}
