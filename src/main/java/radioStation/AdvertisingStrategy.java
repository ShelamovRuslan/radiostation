package radioStation;

public class AdvertisingStrategy extends BroadcastContext implements Strategy {
    public void add(Record record){

        Advertising rec = (Advertising) record;
        if(this.checkRec(rec)) {
            final double promotionPrice = 5.0 / 1000.0;
            DataBroadcast.PlayList.add(rec);
            int time = Integer.parseInt(rec.secondsRecordingTime()) * 1000;
            DataBroadcast.playListTimeMillisecond += time;
            DataBroadcast.income += promotionPrice * time;
            DataBroadcast.painingContentTimeMillisecond += time;
            System.out.println("Рекламный блок добавлен.");
        }
    }
    public boolean check(Record record) {

        Advertising promotionRec = (Advertising) record;
        int timeRecordMillisecond = Integer.parseInt(promotionRec.secondsRecordingTime()) * 1000;

         return timeRecordMillisecond < DataBroadcast.translationTimeMillisecond &&
                timeRecordMillisecond + DataBroadcast.painingContentTimeMillisecond < DataBroadcast.translationTimeMillisecond / 2 &&
                DataBroadcast.playListTimeMillisecond + timeRecordMillisecond < DataBroadcast.translationTimeMillisecond;

    }
    public void play(Record record) {
        Advertising promotionRec = (Advertising) record;
        System.out.printf ("Рекламный блок: длительность %s секунд, название блока \"%s\".\n", promotionRec.secondsRecordingTime(), promotionRec.promotionalProductTitle());
    }
}