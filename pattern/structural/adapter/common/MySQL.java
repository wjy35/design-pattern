package structural.adapter.common;

import java.util.HashMap;
import java.util.Map;

public class MySQL implements SQL {
    private final Map<Long,String> database;

    @Override
    public void insert(Long id, String data) {
        database.put(id,data);
    }

    @Override
    public void delete(Long id) {
        database.remove(id);
    }

    @Override
    public String select(Long id) {
        return database.getOrDefault(id,null);
    }

    public MySQL() {
        this.database = new HashMap<>();
    }
}
