package structural.adapter.common;

public interface NoSQL {
    void put(Long id,String data);
    String get(Long id);
    void remove(Long id);
}
