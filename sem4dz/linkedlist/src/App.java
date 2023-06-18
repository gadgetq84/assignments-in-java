import java.util.LinkedList;
import java.util.Stack;

import collections.myArrayStack;
import collections.myLinkedList;
import collections.myStack;

public class App {
    public static void main(String[] args) throws Exception {
        // //Первые 2 задания 1. Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод, который вернет “перевернутый” список.
        // 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() -
        // помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
        // очереди и удаляет его, first() - возвращает первый элемент из очереди, не
        // удаляя.
        System.out.println("############################################################################");
        int[] array = { 16, 12, 43, 7, 1, 9, 20, 13, 11 };
        myLinkedList.addInLinkedList(array);
        myLinkedList.printLinkedList("Исходный список: ");

        myLinkedList.invertLinkedList();
        myLinkedList.printLinkedList("Перевернутый список: ");

        myLinkedList.enqueue("test1");
        myLinkedList.printLinkedList("список с новым элементом: ");

        String firstElement = myLinkedList.dequeue();
        System.out.println("Удалили первый элемент это->" + firstElement);
        myLinkedList.printLinkedList("Удалили первый элемент");

        firstElement = myLinkedList.first();
        System.out.println("Вывели первый элемент не удаляя это ->" +
                firstElement);
        myLinkedList.printLinkedList("Эементы стека: ");
        System.out.println("############################################################################");
        // Каркулятор с возможностью отменить последнюю операцию.. да и не только
        // последнюю операцию.
        myStack.runCalc();
        System.out.println("############################################################################");
        // Реализовать стэк с помощью массива. Нужно реализовать методы: size(),
        // empty(), push(), peek(), pop().
        myArrayStack myStack = new myArrayStack(5);
        System.out.printf(" Сейчас  myStack.empty() вернул %s\n", myStack.empty());
        myStack.push(2);
        myStack.push(5);
        myStack.push(42);
        myStack.push(4);
        System.out.print("Текущий стек: ");
        myStack.print();
        System.out.printf(" Сейчас  myStack.empty() вернул %s\n", myStack.empty());
        System.out.printf(" Текущий размер стека %s\n", myStack.size());
        System.out.printf(" Максимальный размер стека %s\n", myStack.maxSize());

        System.out.printf(" Верхний элемент стека %s\n", myStack.peek());
        System.out.printf(" Удалили элемент стека %s\n", myStack.pop());
        System.out.print("Текущий стек: ");
        myStack.print();
        System.out.println("############################################################################");
    }
}
