package Repository;

import java.util.List;

public interface IcrudRepository <T>{
    void create (T t);
    List<T> readAll();
    T read(long id);
    boolean update(T t);
    boolean delete(long id);
}
