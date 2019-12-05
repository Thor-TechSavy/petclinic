package com.springframework.petclinic.repositories;

import com.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Pet, Long> {
}
