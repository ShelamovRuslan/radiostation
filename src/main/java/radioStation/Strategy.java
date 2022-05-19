package radioStation;

public interface Strategy {
    boolean check(Record record);
    void add(Record record);
}
