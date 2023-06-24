package collections;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class noteBook {
     String vendor;
     String materials;
     Color ncolor;
    int osuSize;
    boolean isSsd; // 0-hdd 1-ssd
    int diskSize; // Гибибайт русское обозначение: ГиБ; международное: GiB
    short usbcount;
    String OS;
    byte cpuCount;
    short cpuFrequencyBase;
    Date manufactureDate;
    
/// Конструктор
    public noteBook(String ven, String mtrls, Color nc, int os, boolean isSsd, int dS,
            short usbc, String OS, Date mfD, byte cC, short cFB) {
        this.vendor = ven;
        this.materials = mtrls;
        this.ncolor = nc;
        this.cpuCount = cC;
        this.cpuFrequencyBase = cFB;
        this.osuSize = os;
        this.isSsd = isSsd; // 0-hdd 1-ssd
        this.diskSize = dS;
        this.usbcount = usbc;
        this.OS = OS;
        this.manufactureDate = mfD;

    }
    // переопределение методов
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        noteBook nb = (noteBook) obj;
        return vendor == nb.vendor && materials == nb.materials && osuSize == nb.osuSize && isSsd == nb.isSsd
                && diskSize == nb.diskSize && usbcount == nb.usbcount && cpuCount == nb.cpuCount
                && cpuFrequencyBase == nb.cpuFrequencyBase;
    }
 // переопределение методов
    @Override
    public int hashCode() {
        return Objects.hash(vendor, materials, osuSize, isSsd, diskSize, usbcount, cpuCount, cpuFrequencyBase);
    }
 // переопределение методов
    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        
        String disktype;
        if (isSsd) {
            disktype = "SSD";
        } else {
            disktype = "HDD";
        }

        return "Производитель " + vendor + "; Материал " + materials + "; Цвет " + ncolor.toString() + "; Кол-во ядер "
                + cpuCount + "; Базовая частота " + cpuFrequencyBase + "Ггц; ОЗУ " + osuSize
                + "Гб; " + disktype + " " + "; Размер диска " + diskSize + "Гб; Кол-во USB " + usbcount + "шт.; ОС " + OS
                + "; Дата производства: "
                + format.format(manufactureDate) + "\n ";
    }


   

}
