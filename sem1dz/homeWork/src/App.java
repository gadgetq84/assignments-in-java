import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Метод вычисления суммы чисел
        // getSumOfNum();

        // Метод вычисления простых чисел
        // getSimpleDig();

        // Метод простой каркулятор
         simpleCalc();

        // метод нахождения решения уравнения
        // solutionOfEquation("?4+?5=89");
        // solutionOfEquation("2?+?5=69");
        // solutionOfEquation("2?+?5=79");

    }

    // метод возвращает интовое значение из строки
    private static int myintval(String string, int index) {
        // ставим вместо вопросика цифирку и возвращаем интовое значение
        return Integer.parseInt(string.replaceFirst("\\?", Integer.toString(index)));
    }

    // метод нахождения решения уравнения
    private static void solutionOfEquation(String string) {
        // делим уравнение на 2 части
        String[] eq = string.split("\\=");
        // разделяем левую часть уравнения на части
        String[] terms = eq[0].split("\\+");
        int res = Integer.parseInt(eq[1]);
        int index = 0;
        int sum = 0;
        while (sum < res) {
            sum = myintval(terms[0], index) + myintval(terms[1], index);
            if (sum != res)
                index++;
        }
        if (sum == res) {
            System.out.printf(" %s + %s = %s!\n", myintval(terms[0], index), myintval(terms[1], index), sum);
        } else {
            System.out.printf("У уравнения %s нет решения.", string);
        }
    }

    // Метод простой каркулятор
    private static void simpleCalc() throws SecurityException, IOException {
        Logger logger = Logger.getLogger(App.class.getName());
        FileHandler info = new FileHandler("log.txt");
        info.setEncoding("UTF-8");
        logger.addHandler(info);
        SimpleFormatter sFormat = new SimpleFormatter();
        info.setFormatter(sFormat);

        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите первое число:");
        float dig1 = Float.parseFloat(Scanner.nextLine());
         logger.info("User insert first number: " + Float.toString(dig1));
        System.out.printf("Введите действие / * + - :");
        String action = Scanner.nextLine();
        logger.info("User CHOOSE ACTION: " + action);
        System.out.printf("Введите второе число:");
        float dig2 = Float.parseFloat(Scanner.nextLine());
         logger.info("User insert second number: " + Float.toString(dig2));

        switch (action) {
            case "+":
                System.out.printf(" %s + %s = %s!\n", dig1, dig2, dig1 + dig2);
                logger.info("Wait for the calculation: Pi pa po pu result-> " + Float.toString(dig1 + dig2));
                break;
            case "-":
                System.out.printf(" %s - %s = %s!\n", dig1, dig2, dig1 - dig2);
                logger.info("Wait for the calculation: Pi pa po pu result-> " + Float.toString(dig1 - dig2));
                break;
            case "*":
                System.out.printf(" %s * %s = %s!\n", dig1, dig2, dig1 * dig2);
                logger.info("Wait for the calculation: Pi pa po pu result-> " + Float.toString(dig1 * dig2));
                break;
            case "/":
                if (dig2 != 0) {
                    System.out.printf(" %s / %s = %s!\n", dig1, dig2, dig1 / dig2);
                    logger.info("Wait for the calculation: Pi pa po pu result-> " + Float.toString(dig1 / dig2));
                } else {
                    System.out.printf(" %s / %s = %s!\n", dig1, dig2, "Низя так!!!");
                    logger.info("Fatal error!!! attempt to divide by zero. Destroy everyone." );
                }
                break;

            default:
                break;
        }

    }

    // Метод вычисления простых чисел
    private static void getSimpleDig() {
        int maxDig = 1000;
        boolean flag = true;
        for (int x = 2; x < maxDig; x++) {
            flag = true;
            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.printf("%s\n", x);
            }
        }

    }

    // Метод вычисления суммы чисел
    private static void getSumOfNum() {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите число:");
        int dig = Integer.parseInt(Scanner.nextLine());
        System.out.printf("Сумма чисел от 1 до %s равна  %s!\n", dig, dig * (dig + 1) / 2);
    }
}
