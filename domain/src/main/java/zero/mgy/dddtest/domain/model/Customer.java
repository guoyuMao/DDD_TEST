package zero.mgy.dddtest.domain.model;

import java.time.LocalDateTime;

/**
 * 领域对象
 */
public class Customer {
    private String Id;
    private String name;
    private String email;
    private LocalDateTime birthDate;

    public Customer() {
    }

    public Customer(String id, String name, String email, LocalDateTime birthDate) {
        Id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Customer(String id, String name, String email) {
        Id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
}
