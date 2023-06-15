public class list {

    public static Node push(Node head, int key) {
        Node node = new Node();
        node.data = key;
        node.prev = null;
        node.next = head;

        // изменить `prev` существующего головного узла, чтобы он указывал на новый узел
        if (head != null) {
            head.prev = node;
        }

        // обновить указатель заголовка и вернуться
        head = node;
        return head;
    }

    // вывод узылов двусвязного списка
    public static void printDDL(String msg, Node head) {
        System.out.print(msg);
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    // метод для замены указателей `next` и `prev` данного узла
    public static void swap(Node node) {
        Node prev = node.prev;
        node.prev = node.next;
        node.next = prev;
    }

    // метод для реверсирования двусвязного списка
    public static Node reverseDDL(Node head) {
        Node prev = null;
        Node curr = head;

        // обход списка
        while (curr != null) {
            // поменять местами указатели `next` и `prev` для текущего узла
            swap(curr);

            // обновить предыдущий узел перед переходом к следующему узлу
            prev = curr;

            // перейти к следующему узлу в двусвязном списке (перейти с помощью
            // указатель `prev`, так как указатели `next` и `prev` поменялись местами)
            curr = curr.prev;
        }

        // обновить указатель на последний узел
        if (prev != null) {
            head = prev;
        }

        return head;
    }
}

class Node {
    int data;
    Node next, prev;
}