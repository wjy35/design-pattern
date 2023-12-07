package structural.adapter.v1;

import structural.adapter.common.MySQL;
import structural.adapter.common.Redis;
import structural.adapter.common.Service;

public class Main {
    public static void main(String[] args) {
        Service service;
        service = new ServiceWithSQL(new MySQL());
//        service = new ServiceWithNoSQL(new Redis());

        service.regist(1l,"design-pattern");
        service.regist(2l,"structural-adapter");

        service.delete(1l);

        String data = service.find(2l);

        System.out.println("data = " + data);
    }
}
