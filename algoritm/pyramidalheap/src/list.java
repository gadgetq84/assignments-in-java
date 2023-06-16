public class list {
    static Node head;
    static Node tail;

    public static Node push(int value) {
        Node node = new Node();
        node.data = value;
        // изменить `prev` существующего головного узла, чтобы он указывал на новый узел
        if (head != null) {;
            node.prev = tail;
            tail.next = node;
            tail = node;

        } else {
            head = node;
            tail = node;
        }

        // обновить указатель заголовка и вернуться
        // head = node;
        return head;
    }

    // вывод узылов двусвязного списка
    public static void printDDL(String msg) {
        Node curr = head;
        System.out.print(msg);
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
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
    public static Node reverseDDL() {
        // Node prev = null;
        Node curr = head;
       // System.out.println(head.next.data);
        // обход списка
        while (curr != null) {
            // поменять местами указатели `next` и `prev` для текущего узла
            Node next = curr.next;
            Node prev = curr.prev;

            curr.next = prev;
            curr.prev = next;

            // prev = curr.prev;

            if (prev == null) {
                tail = curr;
            }
            if (next == null) {
                head = curr;
            }
            curr = next;
        }
        return head;
    }
}

class Node {
    int data;
    Node next, prev;
}