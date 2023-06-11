import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // первое задание
        // String jsonstring = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        // List<String> parsjsonstring = new ArrayList<>();
        // parsjsonstring = SqlQueryBuilder.myJsonParser(jsonstring);
        // System.out.printf("%s\n", SqlQueryBuilder.createSqlQuery(parsjsonstring));

        // Сортировка пузырьком и логирование
        // int[] sortArr = { 12, 6, 4, 1, 15, 10 };
        // bubblelog.bubbleSort(sortArr);
        // for (int i = 0; i < sortArr.length; i++) {
        //     System.out.print(sortArr[i] + "\n");
        // }

        // метод который распарсит json и, используя StringBuilder, создаст строки вида:
        // Студент [фамилия] получил [оценка] по предмету [предмет].
        String jsonstr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        List<ArrayList<String>> parsjsonst = new ArrayList<>();
        parsjsonst = jsonpars.myJsonParser(jsonstr);
        jsonpars.PrintMyJsonParse(parsjsonst);

    }

}
