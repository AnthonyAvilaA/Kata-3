package software.ulpgc.kata3.clean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Barchart {
    private final String title;
    Map<String, Integer> frequencies;

    public Barchart(String title) {
        this.title = title;
        this.frequencies = new HashMap<>();
    }

    public void add(String key, Integer value) {
        frequencies.put(key, value);
    }

    public String getTitle() {
        return this.title;
    }

    public Set<String> getKeys() {
        return frequencies.keySet();
    }

    public Integer getValue(String key) {
        return frequencies.get(key);
    }
}
