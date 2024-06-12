package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.launchcode.techjobs.persistent.models.data.EmployerRepository;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Please enter location")
    @Size(min = 3 ,max = 50, message = "Number letters cannot be exceed more than 50 and less than 3")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer (){}
}
