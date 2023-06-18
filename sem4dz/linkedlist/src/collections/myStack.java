package collections;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class myStack {
    // свойства класса
    private static Stack nums = new Stack();// стек для хранения результатов
    private static float result = 0;
    private static float dig1;
    private static float dig2;
    private static String action;

    // метод для добавения значений в стек
    private static void AddInStackNums(Object dig) {
        nums.push(dig);
    }

    // метод для ввода пользователем его действий
    private static void promptCalc() {
        Scanner Scanner = new Scanner(System.in);
        // если еще стек пустой забиваем в него первое число
        if (nums.isEmpty()) {
            System.out.printf("Введите число:");
            dig1 = Float.parseFloat(Scanner.nextLine());
            result = dig1;
            AddInStackNums(result);
            // так-же меняем вывод информации о возможных действиях
            System.out.printf("Введите действие / * + - :");
        } else {
            System.out.printf("Введите действие / * + - undo(удалить последний результат) или exit(для выхода): ");
        }

        action = Scanner.nextLine();
        // проверяем что в действиях пользователь не вбил спец слова
        if (action.toLowerCase().equals("exit") != true && action.toLowerCase().equals("undo") != true) {
            System.out.printf("Введите число:");
            dig2 = Float.parseFloat(Scanner.nextLine());

        }

    }
//запуск самого каркулятора
    public static void runCalc() {
        boolean flag = true;
        while (flag) {
            promptCalc();
            switch (action) {
                case "+":
                    result += dig2;
                    // в стек записываем результат
                    AddInStackNums(result);
                    break;
                case "-":
                    result -= dig2;
                    AddInStackNums(result);
                    break;
                case "*":
                    result *= dig2;
                    AddInStackNums(result);
                    break;
                case "/":
                    if (dig2 != 0) {
                        result /= dig2;
                        AddInStackNums(result);
                    } else {
                        System.out.printf(" %s / %s = %s!\n", result, dig2, "Низя так!!!");
                    }
                    break;
                case "exit":
                    flag = false;
                    break;
                case "undo":
                    undoRes();
                    break;

                default:
                    break;
            }
            System.out.printf(" Результат действия = %s!\n", result);

            System.out.printf(" Данные стека  = %s!\n", nums.toString());

        }
    }
// метод удаляющий данные из стека 
    private static void undoRes() {
        nums.pop();
        // проверка что после удаления стек не пустой 
        if (nums.isEmpty()) {
            System.out.printf(" Cтек действий пуст!\n");
            result = 0;
        } else {
            result = (float) nums.peek();
        }

    }

}
