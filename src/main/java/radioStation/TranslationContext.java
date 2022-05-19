package radioStation;

class TranslationContext {
    private Strategy strategy;
    Record record;







    public TranslationContext() {
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

        return strategy.check(rec);
    }
}
