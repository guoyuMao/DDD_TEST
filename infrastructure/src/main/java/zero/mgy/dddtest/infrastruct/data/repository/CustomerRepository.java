package zero.mgy.dddtest.infrastruct.data.repository;

import zero.mgy.dddtest.domain.interfaces.ICustomerRepository;
import zero.mgy.dddtest.domain.model.Customer;

import java.util.List;

public class CustomerRepository extends Repository<Customer> implements ICustomerRepository {
    @Override
    public Customer getByEmail(String email) {
        return null;
    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public Customer getById(String id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public int saveChanges() {
        return 0;
    }
}
