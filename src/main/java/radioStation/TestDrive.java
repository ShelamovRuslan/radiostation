package radioStation;

public class TestDrive{
    public static void main(String[] args) {

        TestDrive();


    }

    public static void TestDrive() {

        BroadcastContext translation = new BroadcastContext();


        Record one = new Song(
                "330",
                "Song 1",
                "Song 1");
        Record two = new Song(
                "30",
                "Song 2",
                "Song 2");
        Record free = new Song(
                "30",
                "Song 3",
                "Song 3");
        Record four = new Advertising(
                "1",
                "тайд"
                );
        Record five = new Interview(
                "10",
                "Петр"
        );

        translation.broadcastTime(120);
        translation.checkRec(one);
        translation.checkRec(two);
        translation.checkRec(free);
        translation.checkRec(four);
        translation.checkRec(five);
        translation.addRec(one);
        translation.addRec(two);
        translation.addRec(free);
        translation.addRec(four);
        translation.addRec(five);
        translation.playList();
        translation.income();

    }
}
