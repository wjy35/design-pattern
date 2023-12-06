package structural.adapter.common;

public interface SQL {
    void insert(Long id,String data);
    void delete(Long id);
    String select(Long id);
}
