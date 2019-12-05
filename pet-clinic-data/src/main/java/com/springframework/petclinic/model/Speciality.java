package com.springframework.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by shivam (techSavyThor) on 05/20/2019
 */
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
