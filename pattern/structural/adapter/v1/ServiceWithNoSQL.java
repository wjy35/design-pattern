package structural.adapter.v1;

import structural.adapter.common.NoSQL;
import structural.adapter.common.Service;

public class ServiceWithNoSQL implements Service {
    private final NoSQL noSql;

    @Override
    public void regist(Long id,String data){
        noSql.put(id,data);
    }

    @Override
    public void delete(Long id){
        noSql.remove(id);
    }

    @Override
    public String find(Long id){
        return noSql.get(id);
    }

    public ServiceWithNoSQL(NoSQL noSql) {
        this.noSql = noSql;
    }
}
