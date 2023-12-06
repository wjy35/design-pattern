package structural.adapter.common;

import structural.adapter.common.NoSQL;

import java.util.HashMap;
import java.util.Map;

public class Redis implements NoSQL {
    private final Map<Long,String> database;

    @Override
    public void put(Long id, String data){
        database.put(id,data);
    }

    @Override
    public String get(Long id){
        return database.getOrDefault(id,null);
    }

    @Override
    public void remove(Long id){
        database.remove(id);
    }

    public Redis() {
        this.database = new HashMap<>();
    }
}
