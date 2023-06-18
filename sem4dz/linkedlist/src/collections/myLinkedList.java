package collections;

import java.util.LinkedList;

public class myLinkedList {
    private static LinkedList<String> list = new LinkedList<>();

    public static void addInLinkedList(int[] array) {
        for (int data : array) {
            list.add(Integer.toString(data));
        }
    }

    public static void invertLinkedList() {
        int size = list.size()-1;

        while (size >= 0) {
            String element = list.remove(size);
            list.addLast(element);
            size--;
        }
    }

    public static void enqueue(String str) {
        list.addLast(str);

    }

    public static String dequeue() {
        String str = list.pop();
        return str;
    }
        public static String first() {
        String first = list.peek();
        return first;
    }
    public static void printLinkedList(String msg) {
        System.out.print(msg);
        System.out.println(list.toString());
    }


}
