package structural.adapter.v2;

import structural.adapter.common.NoSQL;
import structural.adapter.common.SQL;

public class NoSQLAdapter implements SQL {
    private final NoSQL noSQL;

    @Override
    public void insert(Long id, String data) {
        noSQL.put(id,data);
    }

    @Override
    public void delete(Long id) {
        noSQL.remove(id);
    }

    @Override
    public String select(Long id) {
        return noSQL.get(id);
    }

    public NoSQLAdapter(NoSQL noSQL) {
        this.noSQL = noSQL;
    }
}
