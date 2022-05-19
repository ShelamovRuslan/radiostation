package radioStation;

import java.util.ArrayList;

public record BroadcastReport(
        int TranslationTimeMinutes,
        ArrayList<Record> playList,
        RadioHost host
){
}
