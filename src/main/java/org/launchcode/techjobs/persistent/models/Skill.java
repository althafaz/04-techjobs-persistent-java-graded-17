package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 255)
    private String description;

    public String getDescription() {
        return description;
    }

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill(){}

    public List<Job> getJobs() {
        return jobs;
    }

}
