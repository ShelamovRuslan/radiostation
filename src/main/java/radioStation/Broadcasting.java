package radioStation;

/**
 * Context
 */

class Broadcasting {
    private Recording strategy;

    public Broadcasting() {
    }
    public void addRec(Recording recording) {
        this.strategy = recording;
        strategy.add(recording);
    }
    public boolean checkRec(Recording recording) {
        this.strategy = recording;
        if (strategy.check(recording)){
            return true;
        } else {
            System.out.println("К сожалению вы не можете добавить запись в плейлист.");
            return false;
        }
    }
    private void playRec(Recording recording) {
        this.strategy = recording;
        strategy.play(recording);
    }
    public void playList() {
        for (Recording record : DataBroadcasting.PlayList){
            playRec(record);
        }
    }
    public void setDuration(int minutes){
        DataBroadcasting.setDuration(minutes);
    }
    public void income (){
        System.out.printf("Доход от трансляции составит %s эвро.", DataBroadcasting.income);
    }

    public void setRadioHost(String name, int experience) {
        DataBroadcasting.setRadioHost(new RadioHost(name, experience));
    }
    public void setGuestRadioHost(String name, String resume) {
        DataBroadcasting.setRadioHost(new RadioHost(name, resume));
    }

    public void save(){
        DataBroadcasting.save();
    }
    public void load(){
        DataBroadcasting.load();
    }
}
