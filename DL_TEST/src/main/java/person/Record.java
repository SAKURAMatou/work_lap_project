package src.main.java.person;

public class Record {
    private String key;
    private int value;

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "key:" + this.getKey() + "  value:" + this.getValue();
    }
}
