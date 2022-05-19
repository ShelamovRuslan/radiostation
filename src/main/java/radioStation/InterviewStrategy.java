package radioStation;

public class InterviewStrategy extends TranslationContext implements Strategy {
    public void add(Record record){

        Interview rec = (Interview) record;
        if(this.checkRec(rec)) {
            final double interviewPrice = 30.0 / 60 / 1000.0;
            DataBroadcast.PlayList.add(rec);
            int time = Integer.parseInt(rec.minutesRecordingTime()) * 60 * 1000;
            DataBroadcast.playListTimeMillisecond += time;
            DataBroadcast.income += interviewPrice * time;
            DataBroadcast.painingContentTimeMillisecond += time;
        }
    }
    public boolean check(Record record) {


        Interview interviewRec = (Interview) this.record;
        int timeRecordMillisecond = Integer.parseInt(interviewRec.minutesRecordingTime()) * 60 * 1000;
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