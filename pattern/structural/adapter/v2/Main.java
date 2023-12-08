package structural.adapter.v2;

import structural.adapter.common.Redis;
import structural.adapter.common.Service;
import structural.adapter.v1.ServiceWithSQL;

public class Main {
    public static void main(String[] args) {
        Service service;
        service = new ServiceImpl(new NoSQLAdapter(new Redis()));

        service.regist(1l,"design-pattern");
        service.regist(2l,"structural-adapter");

        service.delete(1l);

        String data = service.find(2l);

        System.out.println("data = " + data);
    }
}
