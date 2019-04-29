package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by shivam (techSavyThor) on 04/30/2019
 */
public interface PetService {
    public interface OwnerService {
        Pet findById(Long id);

        Pet save(Pet pet);

        Set<Pet> findAll();
    }
}
