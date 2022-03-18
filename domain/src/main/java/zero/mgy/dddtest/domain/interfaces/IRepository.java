package zero.mgy.dddtest.domain.interfaces;

import java.util.List;

public interface IRepository<T> {
    void add(T t);

    T getById(String id);

    List<T> getAll();

    void update(T t);

    void remove(String id);

    int saveChanges();

}
