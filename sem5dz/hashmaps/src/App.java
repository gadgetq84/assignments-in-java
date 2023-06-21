import collections.TBook;
import collections.chess1;
import collections.chess2;
import collections.heapsort;
import collections.horseJump;

public class App {
    public static void main(String[] args) throws Exception {
        // запускаем наш код
        // для выхода нужно оставить пустыми имя и номер телефона
        ///// TBook.runTBook();

        // Пирамидальная сортировка
        int[] sortArr = { 12, 6, 4, 1, 15, 10 };
        heapsort.heapSort(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "\n");
        }

        //На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга
        //мопед не мой .. я просто хорошо искал )
        //Циклами
        ////chess1.arrangeQueens();
        //Рекурсивный вызов интереснее
        ////chess2.RunChess2();

        //Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз
        horseJump.N = 5;
        int[][] visited = new int[horseJump.N][horseJump.N];
        int pos = 1;
        horseJump.knightTour(visited, 0, 0, pos);
    }
}
