package radioStation;

class BroadcastContext {
    private Strategy strategy;
    Record record;







    public BroadcastContext() {
    }
    public void addRec(Record rec) {

        if (rec instanceof Song) {
            this.strategy = new SongStrategy();
        } else if (rec instanceof Interview) {
            this.strategy = new InterviewStrategy();
        } else if (rec instanceof Advertising) {
            this.strategy = new AdvertisingStrategy();
        }

        strategy.add(rec);
    }
    public boolean checkRec(Record rec) {

        if (rec instanceof Song) {
            this.strategy = new SongStrategy();
        } else if (rec instanceof Interview) {
            this.strategy = new InterviewStrategy();
        } else if (rec instanceof Advertising) {
            this.strategy = new AdvertisingStrategy();
        }

        if (strategy.check(rec)){
            return true;
        } else {
            System.out.println("К сожалению вы не можете добавить запись в плейлист.");
            return false;
        }
    }
    private void playRec(Record rec) {

        if (rec instanceof Song) {
            this.strategy = new SongStrategy();
        } else if (rec instanceof Interview) {
            this.strategy = new InterviewStrategy();
        } else if (rec instanceof Advertising) {
            this.strategy = new AdvertisingStrategy();
        }

        strategy.play(rec);
    }
    public void playList() {
        for (Record record :DataBroadcast.PlayList){
            playRec(record);
        }
    }
    public void broadcastTime (int minutes){
        DataBroadcast.setTranslationTime(minutes);
    }
    public void income (){
        System.out.printf("Доход от трансляции составит %s эвро.", DataBroadcast.income);
    }

}
