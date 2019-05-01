package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Pet;

/**
 * Created by shivam (techSavyThor) on 04/30/2019
 */
public interface PetService {
    public interface OwnerService extends CrudService<Pet,Long> {

    }
}
