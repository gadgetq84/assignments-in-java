public class pyr {
            // Реализация пирамидальной сортировки
            public static void mysort(int arr[]) {
                int n = arr.length;
                // Построение кучи (перегруппируем массив)
                for (int i = n / 2 - 1; i >= 0; i--)
                    heap(arr, n, i);
                // Один за другим извлекаем элементы из кучи
                for (int i = n - 1; i >= 0; i--) {
                    // Перемещаем текущий корень в конец
                    int temp = arr[0];
                    arr[0] = arr[i];
                    arr[i] = temp;

                    // Вызываем метод heapна уменьшенной куче
                    heap(arr, i, 0);
                }
            }

            //метод для преобразования в двоичную кучу поддерева с корневым узлом i,
            // что является
            // индексом в arr[]. n - размер кучи
           public static void heap(int arr[], int n, int i) {
                int largest = i; // Инициализируем наибольший элемент как корень
                int l = 2 * i + 1; // левый = 2*i + 1
                int r = 2 * i + 2; // правый = 2*i + 2

                // Если левый дочерний элемент больше корня
                if (l < n && arr[l] > arr[largest])
                    largest = l;

                // Если правый дочерний элемент больше, чем самый большой элемент на данный
                // момент
                if (r < n && arr[r] > arr[largest])
                    largest = r;
                // Если самый большой элемент не корень
                if (largest != i) {
                    int swap = arr[i];
                    arr[i] = arr[largest];
                    arr[largest] = swap;

                    // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
                    heap(arr, n, largest);
                }
            }
            // вывода на экран массива 
            public static void printArray(int arr[]) {
                int n = arr.length;
                for (int i = 0; i < n; ++i)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
}
