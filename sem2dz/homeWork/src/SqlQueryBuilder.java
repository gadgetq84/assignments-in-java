import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Парсим  json строку до нужного нам состояния
public class SqlQueryBuilder {
    static List<String> myJsonParser(String jsonstr) {
        List<String> res = new ArrayList<>();
        jsonstr = jsonstr.replaceAll("\\{", "").replaceAll("\\}", "").replace(":", "=");
        String[] splitstr = jsonstr.split(",");

        for (int i = 0; i < splitstr.length; i++) {
// двойные кавычки в названия полей
            splitstr[i] = splitstr[i].replaceFirst("\"", "`").replaceFirst("\"", "`");
        }

        res = Arrays.asList(splitstr);
// возвращаем в виде листа 
        return res;
    }
// формируем наш запрос 
    public static StringBuilder createSqlQuery(List<String> parsjsonstring) {
        StringBuilder res = new StringBuilder();
        res.append("select * from students where ");
        for (String item : parsjsonstring) {
            if (item.indexOf("null") == -1) {
                res.append(item);
            }
        }

        return res;
    }
}
