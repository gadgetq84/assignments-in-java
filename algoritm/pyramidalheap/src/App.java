public class App {
        public static void main(String[] args) throws Exception {
                // int array[] = { 16, 12, 43, 7, 1, 9 };
                // pyr.mysort(array);
                // System.out.println("Отсортированный массив ");
                // pyr.printArray(array);

                // Необходимо реализовать метод разворота связного списка (двухсвязного или
                // односвязного на выбор).
                int[] keys = { 16, 12, 43, 7, 1, 9, 20, 13, 11 };

                for (int key : keys) {
                        list.push(key);
                }

                list.printDDL("Original list: ");
                list.reverseDDL();
                list.printDDL("Reversed list: ");

        }
}
