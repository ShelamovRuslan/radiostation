package radioStation;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DataBroadcast {
    protected static long translationTimeMillisecond;
    protected static long playListTimeMillisecond;
    protected static long painingContentTimeMillisecond;
    public static double income;
    protected static ArrayList<Record> PlayList = new ArrayList<>();

    static public void setTranslationTime(int minutes) {
        DataBroadcast.translationTimeMillisecond = (long) minutes * 60 * 1000;
    }

    

}