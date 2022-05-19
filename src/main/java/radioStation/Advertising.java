package radioStation;

import java.io.Serializable;

/**
 * Strategy Advertising
 */

public class Advertising extends Broadcasting implements Recording, Serializable {

    String secondsRecordingTime;
    String promotionalProductTitle;

    public Advertising(String secondsRecordingTime, String promotionalProductTitle) {
        this.secondsRecordingTime = secondsRecordingTime;
        this.promotionalProductTitle = promotionalProductTitle;
    }

    public void add(Recording record){

        Advertising promotionRec = (Advertising) record;
        if(promotionRec.checkRec(promotionRec)) {
            final double promotionPrice = 5.0 / 1000.0;
            DataBroadcasting.PlayList.add(this);
            int time = Integer.parseInt(promotionRec.secondsRecordingTime) * 1000;
            DataBroadcasting.playListTimeMillisecond += time;
            DataBroadcasting.income += promotionPrice * time;
            DataBroadcasting.painingContentTimeMillisecond += time;
            System.out.println("Рекламный блок добавлен.");
        }
    }
    public boolean check(Recording record) {

        Advertising promotionRec = (Advertising) record;
        int timeRecordMillisecond = Integer.parseInt(promotionRec.secondsRecordingTime) * 1000;

         return timeRecordMillisecond < DataBroadcasting.broadcastingTimeMillisecond &&
                timeRecordMillisecond + DataBroadcasting.painingContentTimeMillisecond < DataBroadcasting.broadcastingTimeMillisecond / 2 &&
                DataBroadcasting.playListTimeMillisecond + timeRecordMillisecond < DataBroadcasting.broadcastingTimeMillisecond;

    }
    public void play(Recording record) {
        Advertising promotionRec = (Advertising) record;
        System.out.printf ("Рекламный блок: длительность %s секунд, название блока \"%s\".\n",
                promotionRec.secondsRecordingTime,
                promotionRec.promotionalProductTitle);
    }
}