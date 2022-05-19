package radioStation;

public class TestDrive{
    public static void main(String[] args) {

        TestDrive();


    }

    public static void TestDrive() {

        TranslationContext translation = new TranslationContext();
        DataBroadcast.setTranslationTime(120);

        Song one = new Song(
                "10",
                "Song 1",
                "Song 1");
        Song two = new Song(
                "10",
                "Song 2",
                "Song 2");
        Song free = new Song(
                "10",
                "Song 3",
                "Song 3");
        Song four = new Song(
                "10",
                "Song 4",
                "Song 4");
        Song five = new Song(
                "10",
                "Song 5",
                "Song 5");

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

        for (Record rec : DataBroadcast.PlayList)
            System.out.println(rec);
       /* int i = 5;
        System.out.println(++i - ++i);*/
    }
}
