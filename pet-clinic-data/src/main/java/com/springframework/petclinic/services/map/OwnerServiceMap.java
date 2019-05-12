package com.springframework.petclinic.services.map;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by shivam (techSavyThor) on 05/02/2019
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll()  ;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String LastName) {
        return null;
    }
}
