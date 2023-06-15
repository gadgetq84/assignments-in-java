public class App {
        public static void main(String[] args) throws Exception {
                // int array[] = { 16, 12, 43, 7, 1, 9 };
                // pyr.mysort(array);
                // System.out.println("Отсортированный массив ");
                // pyr.printArray(array);

                int[] keys = { 16, 12, 43, 7, 1, 9, 20, 13, 11};

                Node head = null;
                for (int key : keys) {
                        head = list.push(head, key);
                }

                list.printDDL("Original list: ", head);
                head = list.reverseDDL(head);
                list.printDDL("Reversed list: ", head);

        }
}
