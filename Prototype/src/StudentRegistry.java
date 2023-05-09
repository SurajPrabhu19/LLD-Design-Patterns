import java.util.*;

public class StudentRegistry<T> {
    private HashMap<String, T> map;

    public StudentRegistry() {
        super();
        map = new HashMap<String, T>();
    }

    public HashMap<String, T> getMap() {
        return map;
    }

    public void register(String key, T obj) {
        map.put(key, obj);
    }

    T get(String key) {
        return map.get(key);
    }

}
