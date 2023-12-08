package structural.adapter.v2;

import structural.adapter.common.SQL;
import structural.adapter.common.Service;

public class ServiceImpl implements Service {
    private final SQL sql;

    @Override
    public void regist(Long id,String data){
        sql.insert(id,data);
    }

    @Override
    public void delete(Long id){
        sql.delete(id);
    }

    @Override
    public String find(Long id){
        return sql.select(id);
    }

    public ServiceImpl(SQL sql) {
        this.sql = sql;
    }
}
