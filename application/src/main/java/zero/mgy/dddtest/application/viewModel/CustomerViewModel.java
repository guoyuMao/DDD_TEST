package zero.mgy.dddtest.application.viewModel;

import java.time.LocalDateTime;

public class CustomerViewModel {
    public String id;
    public String name;
    public String email;
    public LocalDateTime birthDate;

    public CustomerViewModel(String id, String name, String email, LocalDateTime birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
}
