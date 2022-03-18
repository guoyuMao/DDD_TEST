package zero.mgy.dddtest.infrastruct.data.repository;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import zero.mgy.dddtest.domain.interfaces.IRepository;

import java.util.List;

public class Repository<T> implements IRepository<T> {
    @Override
    public void add(T t) {

    }

    @Override
    public T getById(String id) {
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public void update(T t) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public int saveChanges() {
        return 0;
    }


    public void aAdd(T obj)
    {
        throw new NotImplementedException();
    }

    public void dispose()
    {
        throw new NotImplementedException();
    }

}
