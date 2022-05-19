package radioStation;

public class SongStrategy extends BroadcastContext implements Strategy {
    public void add(Record record){

        Song rec = (Song) record;
        if(this.checkRec(rec)) {
            DataBroadcast.PlayList.add(rec);
            int time = Integer.parseInt(rec.minutesRecordingTime()) * 60 * 1000;
            DataBroadcast.playListTimeMillisecond += time;
            System.out.println("Песня внесена в плей лист.");
        }
    }
    public boolean check(Record record) {
        Song songRec = (Song) record;
        int timeRecordMillisecond = Integer.parseInt(songRec.minutesRecordingTime()) * 60 * 1000;
        return timeRecordMillisecond <= DataBroadcast.translationTimeMillisecond &&
                DataBroadcast.playListTimeMillisecond + timeRecordMillisecond <= DataBroadcast.translationTimeMillisecond;
    }
    public void play(Record record) {
        Song songRec = (Song) record;
        System.out.printf ("Песня: длительность %s минут, название песни \"%s\", исполнитель %s.\n", songRec.minutesRecordingTime(), songRec.songsTitle(), songRec.nameSinger());
    }
}