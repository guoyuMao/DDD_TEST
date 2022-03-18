package zero.mgy.dddtest.domain.interfaces;

import zero.mgy.dddtest.domain.model.Customer;

public interface ICustomerRepository extends IRepository<Customer> {
    Customer getByEmail(String email);
}
