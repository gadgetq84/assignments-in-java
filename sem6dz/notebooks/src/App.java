import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import collections.filters;
import collections.noteBook;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat formater = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);

        noteBook nout1 = new noteBook("Asus", "пластик", Color.DARK_GRAY, 8, true, 256,
                Short.parseShort("4"), "Windows 10",
                formater.parse("Sat, April 20, 2021"), Byte.parseByte("4"), Short.parseShort("3100"));
        noteBook nout2 = new noteBook("Huawei", "пластик,алюминий", Color.GRAY, 8, true, 512,
                Short.parseShort("4"), "Windows 10",
                formater.parse("Sat, April 5, 2019"), Byte.parseByte("4"), Short.parseShort("3100"));
        noteBook nout3 = new noteBook("Apple", "жолезо", Color.MAGENTA, 16, true, 3600,
                Short.parseShort("4"), "Windows 10",
                formater.parse("Sat, April 4, 2023"), Byte.parseByte("4"), Short.parseShort("2400"));
        noteBook nout4 = new noteBook("Msi", "чугуний", Color.ORANGE, 32, true, 2900,
                Short.parseShort("4"), "Windows 10",
                formater.parse("Sat, April 1, 2021"), Byte.parseByte("4"), Short.parseShort("3000"));
        noteBook nout5 = new noteBook("Msi", "чугуний", Color.BLUE, 32, true, 2900,
                Short.parseShort("4"), "Windows 10",
                formater.parse("Sat, April 1, 2021"), Byte.parseByte("4"), Short.parseShort("3000"));
// заполняем наш HashSet 
        HashSet<noteBook> nouts = new HashSet<noteBook>();
        nouts.add(nout1);
        nouts.add(nout2);
        nouts.add(nout3);
        nouts.add(nout4);
        nouts.add(nout5);

// базовые тесты
        System.out.println(nouts);
        System.out.println(nout1.equals(nout2));
        System.out.println(nout4.equals(nout5));
        System.out.println(nouts.contains(nout4));

// вызов фильтра
        filters fil = new filters();
        fil.runFiltering(nouts);
            


    }
}
