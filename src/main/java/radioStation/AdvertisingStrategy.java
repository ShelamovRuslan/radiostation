package radioStation;

public class AdvertisingStrategy extends TranslationContext implements Strategy {
    public void add(Record record){

        Advertising rec = (Advertising) record;
        if(this.checkRec(rec)) {
            final double promotionPrice = 5.0 / 1000.0;
            DataBroadcast.PlayList.add(rec);
            int time = Integer.parseInt(rec.secondsRecordingTime()) * 60 * 1000;
            DataBroadcast.playListTimeMillisecond += time;
            DataBroadcast.income += promotionPrice * time;
            DataBroadcast.painingContentTimeMillisecond += time;
        }
    }
    public boolean check(Record record) {

        Advertising promotionRec = (Advertising) this.record;
        int timeRecordMillisecond = Integer.parseInt(promotionRec.secondsRecordingTime()) * 60 * 60 * 1000;
        if (
                timeRecordMillisecond > DataBroadcast.translationTimeMillisecond ||
                        timeRecordMillisecond + DataBroadcast.painingContentTimeMillisecond > DataBroadcast.translationTimeMillisecond / 2 ||
                        DataBroadcast.playListTimeMillisecond + timeRecordMillisecond > DataBroadcast.translationTimeMillisecond
        ) {
            return false;
        } else {
            return true;
        }
    }
}