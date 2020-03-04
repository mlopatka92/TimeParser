package pl.mlopatka.timeparser.units;

public class TimeUnit {

    private final String name;
    private final int value;

    public TimeUnit(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
