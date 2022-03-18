package zero.mgy.dddtest.application.interfaces;

import zero.mgy.dddtest.application.viewModel.CustomerViewModel;

import java.util.List;

public interface ICustomerAppService {

    void register(CustomerViewModel customerViewModel);

    List<CustomerViewModel> getAll();

    void update(CustomerViewModel customerViewModel);

    void Remove(String id);
}
