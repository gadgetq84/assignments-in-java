package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class filters {
    private Map<String, String> filterss = new HashMap<String, String>();
// запуск в цикле метода который выводит на экран меню 
    public void runFiltering(HashSet<noteBook> nouts) {
        boolean flag = true;
        while (flag) {
            flag = prompt(nouts);
        }

    }
// при инициализации забиваем максимальными значениями фильтр
    public filters() {
        this.filterss.put("ОЗУ", Integer.toString(Integer.MAX_VALUE));
        this.filterss.put("Объем ЖД", Integer.toString(Integer.MAX_VALUE));
        this.filterss.put("Кол-во ядер", Byte.toString(Byte.MAX_VALUE));
        this.filterss.put("Частота процессора", Short.toString(Short.MAX_VALUE));
    }
// метод выводит ена экран меню
    private boolean prompt(HashSet<noteBook> nouts) {

        Scanner Scanner = new Scanner(System.in);
        // предлагаем ввести номер параметра
        System.out.printf("Параметры фильтрации\n\r");
        System.out.printf(
                "1 - ОЗУ %sGB\n 2 - Объем ЖД %sGb\n 3 - Кол-во ядер %sшт.\n 4 - Частота процессора %sМгц\n 0 - Выход \n",
                this.filterss.get("ОЗУ"), this.filterss.get("Объем ЖД"), this.filterss.get("Кол-во ядер"),
                this.filterss.get("Частота процессора"));

        System.out.printf("Введите номер пункта меню:");
        int key = Integer.parseInt(Scanner.nextLine());
        // Пустой ввод равно выход из программы
        if (key > 0 && key<=4) {
            filtering(key);
            printHashSet(nouts);
            return true;
        } else {
            return false;
        }
    }

    private void printHashSet(HashSet<noteBook> nouts) {
        List<noteBook> filterlist;
        // фильтр возвращает нужные значения в видк списка
        filterlist = nouts.stream()
                .filter(noteBook -> noteBook.osuSize <= Integer.parseInt(filterss.get("ОЗУ"))
                        && noteBook.diskSize <= Integer.parseInt(filterss.get("Объем ЖД"))
                        && noteBook.cpuCount <= Integer.parseInt(filterss.get("Кол-во ядер"))
                        && noteBook.cpuFrequencyBase <= Integer.parseInt(filterss.get("Частота процессора")))
                .collect(Collectors.toList());
        System.out.println(
                "#################################################Результат работы фильтра#########################################################################");
        System.out.println(filterlist);
        System.out.println(
                "##########################################################################################################################");
    }
// форма ввода параметров фильтра
    public int inputBox(String msg) {
        System.out.printf(msg + ": ");
        Scanner Scanner = new Scanner(System.in);
        int value = Integer.parseInt(Scanner.nextLine());
        return value;

    }
// Меню с терущими параметрами фильтрации
    public void filtering(int key) {
        switch (key) {
            case 1:
                this.filterss.put("ОЗУ", String.valueOf(inputBox("Введите кол-во ОЗУ")));
                break;
            case 2:
                this.filterss.put("Объем ЖД", String.valueOf(inputBox("Введите объем ЖД")));
                break;
            case 3:
                this.filterss.put("Кол-во ядер", String.valueOf(inputBox("Введите кол-во ядер")));
                break;
            case 4:
                this.filterss.put("Частота процессора", String.valueOf(inputBox("Введите частоту процессора")));
                break;
            default:
                break;
        }

    }

}
