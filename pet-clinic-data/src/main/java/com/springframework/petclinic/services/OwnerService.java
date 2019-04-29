package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Owner;

import java.util.Set;
/**
 * Created by shivam (techSavyThor) on 04/30/2019
 */
public interface OwnerService {
    Owner findByLastName(String LastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
