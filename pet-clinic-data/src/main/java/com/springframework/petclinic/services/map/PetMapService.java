package com.springframework.petclinic.services.map;

import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by shivam (techSavyThor) on 05/02/2019
 */
@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll()  ;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
