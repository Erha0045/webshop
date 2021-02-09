package kea3.sem.webshop.Repository;

import java.util.List;

public interface IcrudRepository <T>{
    void create (T t);
    List<T> readAll();
    T read(long id);
    void update(T t);
    void delete(long id);
}
