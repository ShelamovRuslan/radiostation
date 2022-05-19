package radioStation;

import java.util.ArrayList;

public class DataBroadcast {
    protected static long translationTimeMillisecond;
    protected static long playListTimeMillisecond;
    protected static long painingContentTimeMillisecond;
    protected static double income;
    protected static ArrayList<Record> PlayList = new ArrayList<>();

    public static void setPlayList(ArrayList<Record> records) {
        DataBroadcast.PlayList = records;
    }

    static public void setTranslationTime(int minutes) {
        DataBroadcast.translationTimeMillisecond = (long) minutes * 60 * 1000;
    }
}