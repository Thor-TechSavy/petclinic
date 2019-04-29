package com.springframework.petclinic.model;

import java.io.Serializable;

/**
 * Created by shivam (techSavyThor) on 04/30/2019
 */

public class BaseEntity implements Serializable  {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
}
