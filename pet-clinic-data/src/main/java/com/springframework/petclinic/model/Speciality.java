package com.springframework.petclinic.model;

/**
 * Created by shivam (techSavyThor) on 05/20/2019
 */

public class Speciality extends BaseEntity{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
