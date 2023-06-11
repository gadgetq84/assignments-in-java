import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class bubblelog {
    public static void bubbleSort(int[] sortArr) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(bubblelog.class.getName());
        FileHandler info = new FileHandler("log.txt");
        info.setEncoding("UTF-8");
        logger.addHandler(info);
        SimpleFormatter sFormat = new SimpleFormatter();
        info.setFormatter(sFormat);

        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    logger.info("Changing cells " + Integer.toString(sortArr[j]) +" and "+ Integer.toString(sortArr[j+1])+" in places.");
                } else
                {
                     logger.info("Skipping cells " + Integer.toString(sortArr[j]) +" and "+ Integer.toString(sortArr[j+1])+".");
                }
            }
        }
    }


}
