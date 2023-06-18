package collections;

public class myArrayStack {
    
    private static int array[];
    // текущий индекс
    private static int curIndex;
    // емкость стека
    private static int capacity;

    // инициализация стека
    public myArrayStack(int size) {
        array = new int[size];
        capacity = size;
        curIndex = -1;
    }
// метод добавления элементов в стек
    public void push(int x) {
        System.out.println("Вставили-> " + x);
        array[++curIndex] = x;
    }
// метод вывода стека на печать
    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print("[" + Integer.toString(array[i]) + "] ");

        }
        System.out.print("\n\r");
    }
// метод возвращает текущий размер стека
    public int size() {
        return curIndex + 1;
    }
// метод возвращает максимальный размер стека
        public int maxSize() {
        return capacity;
    }
// метод проверяет пустой стек или нет
    public boolean empty() {
        if (curIndex == -1) {
            return true;
        } else {
            return false;
        }

    }
// возвращаем самый последний добавленный элемент  по правилу LIFO
    public int peek() {
        int res=-1;
         if(empty()==false)
        {
            res=array[curIndex];
        }
        return res;
    }
// возвращаем самый последний добавленный элемент по правилу LIFO и удаляем его из стека 
    public int pop() {
        if(empty()==false)
        {
            System.out.println("Удаляем-> " + peek());
            return array[curIndex--];
        }else
        {
            return -1;
        }
    }

}
