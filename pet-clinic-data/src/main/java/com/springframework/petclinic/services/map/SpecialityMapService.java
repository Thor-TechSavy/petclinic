package com.springframework.petclinic.services.map;

import com.springframework.petclinic.model.Speciality;
import com.springframework.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by shivam (techSavyThor) on 05/20/2019
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
