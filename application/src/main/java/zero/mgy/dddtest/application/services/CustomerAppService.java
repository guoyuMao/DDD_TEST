package zero.mgy.dddtest.application.services;

import zero.mgy.dddtest.application.viewModel.CustomerViewModel;

import java.util.List;

import zero.mgy.dddtest.application.interfaces.ICustomerAppService;
import zero.mgy.dddtest.domain.interfaces.ICustomerRepository;

public class CustomerAppService implements ICustomerAppService {
    private ICustomerRepository customerRepository;

    public CustomerAppService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void register(CustomerViewModel customerViewModel) {

    }

    @Override
    public List<CustomerViewModel> getAll() {
        return null;
    }

    @Override
    public void update(CustomerViewModel customerViewModel) {

    }

    @Override
    public void Remove(String id) {

    }
}
