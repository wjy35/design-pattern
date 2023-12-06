package structural.adapter.common;

public interface Service {
    void regist(Long id,String data);
    void delete(Long id);
    String find(Long id);
}
