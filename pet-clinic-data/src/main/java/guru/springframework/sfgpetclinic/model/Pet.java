package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
