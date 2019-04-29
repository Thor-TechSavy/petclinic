package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by shivam (techSavyThor) on 04/30/2019
 */

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

