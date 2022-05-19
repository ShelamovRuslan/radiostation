package radioStation;

public class TestDrive{
    public static void main(String[] args) {

        TestDrive();


    }

    public static void TestDrive() {

        Broadcasting translation = new Broadcasting();
     /*   Recording one = new Song("100", "tide", "Песня");
        Recording two = new Interview("10", "tide");
        Recording free = new Advertising("10", "tide");
        Recording four = new Advertising("10", "tide");
        Recording five = new Advertising("10", "tide");
        translation.setRadioHost("Иван", 10);
        translation.setDuration(120);
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
        translation.save();*/
        translation.load();
        translation.playList();

        /**
         *         .setRadioHost();
         *         .setGuestRadioHost();
         *         .setDuration();
         *         .checkRec(one);
         *         .addRec(one);
         *         .playList();
         *         .income();
         *         .save();
         *         .load();
         */

    }
}
