package radioStation;

public class SongStrategy extends TranslationContext implements Strategy {
    public void add(Record record){

        Song rec = (Song) record;
        if(this.checkRec(rec)) {
            DataBroadcast.PlayList.add(rec);
            int time = Integer.parseInt(rec.minutesRecordingTime()) * 60 * 1000;
            DataBroadcast.playListTimeMillisecond += time;
        }else {
            System.out.println("Не добавлена");
        }
    }
    public boolean check(Record record) {
        Song songRec = (Song) record;
        int timeRecordMillisecond = Integer.parseInt(songRec.minutesRecordingTime()) * 60 * 1000;
        return timeRecordMillisecond <= DataBroadcast.translationTimeMillisecond &&
                DataBroadcast.playListTimeMillisecond + timeRecordMillisecond <= DataBroadcast.translationTimeMillisecond;
    }
}