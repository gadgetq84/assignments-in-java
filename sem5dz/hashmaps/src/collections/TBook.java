package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TBook {
    // пример некого метода который возвращает хешсумму строки
    private static int myHaHash(String x) {
        int hashcode = 0;
        int MOD = 10007;
        int shift = 29;
        for (int i = 0; i < x.length(); i++) {
            hashcode = ((shift * hashcode) % MOD + x.charAt(i)) % MOD;
        }
        return hashcode;
    }

    static HashMap<Integer, String> myBookName = new HashMap<Integer, String>();
    static HashMap<Integer, List<String>> myBookTel = new HashMap<Integer, List<String>>();

    private static int addNameInContact(String name) {
        int hashName = myHaHash(name);
        if (myBookName.get(hashName) == null) {
            myBookName.put(hashName, name);
        }
        return hashName;
    }

    private static void addTelInContact(int hash, String tel) {
        List<String> tels = new ArrayList<>();
        if (myBookTel.get(hash) == null) {
            tels.add(tel);
            myBookTel.put(hash, tels);
        } else {
            tels = myBookTel.get(hash);
            tels.add(tel);
            myBookTel.put(hash, tels);
        }
    }

    private static boolean prompt() {
        Scanner Scanner = new Scanner(System.in);
        // предлагаем ввести имя
        System.out.printf("Введите Имя :");
        String name = Scanner.nextLine();

        // предлагаем ввести телефон
        System.out.printf("Введите Телефон:");
        String tel = Scanner.nextLine();
        // Два пустых поля равно выход из программы
        if (name.length() > 0 && tel.length() > 0) {
            int hashName = addNameInContact(name);
            addTelInContact(hashName, tel);
            return true;
        } else {
            return false;
        }

    }

    private static void printBook() {
        List<Map.Entry<Integer, List<String>>> sortedBookList = new LinkedList<Map.Entry<Integer, List<String>>>(
                myBookTel.entrySet());
        // залип как минимум на час пытаясь осилить сию логику
        Collections.sort(sortedBookList, new Comparator<Map.Entry<Integer, List<String>>>() {
            public int compare(Map.Entry<Integer, List<String>> o1,
                    Map.Entry<Integer, List<String>> o2) {
                return (Integer.compare(o1.getValue().size(), o2.getValue().size()));
            }
        });

        System.out.println("-- Sorted by keys Map--");

        for (Map.Entry<Integer, List<String>> hashkey : sortedBookList) {
            String name = myBookName.get(hashkey.getKey()).toString();
            System.out.println("Имя - " + name +
                    " Телефоны - " + hashkey.getValue().toString());

        }

    }

    public static void runTBook() {
        boolean flag = true;
        while (flag) {
            flag = prompt();
            printBook();
        }
    }

}
