import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Распарсим до нужного состояния
public class jsonpars {
    static List<ArrayList<String>> myJsonParser(String jsonstr) {
        List<ArrayList<String>> res = new ArrayList<>();
        jsonstr = jsonstr.replaceAll("\\[\\{", "").replaceAll("\\}]", "").replace("\"", "");
        String[] splitstr = jsonstr.split("\\},\\{");

        for (int i = 0; i < splitstr.length; i++) {
            String[] res1 = splitstr[i].split(",");
            res.add(new ArrayList<String>(Arrays.asList(res1)));

        }
        // возвращаем в виде листа
        return res;
    }

    public static String[] mySplitStr(String str) {
        String[] res = str.split(":");
        return res;
    }

    public static void PrintMyJsonParse(List<ArrayList<String>> parse) {
        StringBuilder summ = new StringBuilder();
//Перебираем наш списочек и выводим на печать
        for (ArrayList<String> item : parse) {

            summ.append("Студент " + (mySplitStr(item.get(0)))[1] + " получил " + (mySplitStr(item.get(1)))[1]
                    + " по предмету " + (mySplitStr(item.get(2)))[1] + ".\n\r");
        }
        System.out.printf("%s", summ);
    }
}
