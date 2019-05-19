package com.springframework.petclinic.services.map;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.services.OwnerService;
import com.springframework.petclinic.services.PetService;
import com.springframework.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by shivam (techSavyThor) on 05/02/2019
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    private PetTypeService petTypeService;
    private PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
    public Owner save(Owner object)
    { if(object!=null){
        if(object.getPets() !=null){
            object.getPets().forEach(pet -> {
                if (pet.getPetType()!=null){
                    if(pet.getPetType().getId() == null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }
                else
                {
                    throw new RuntimeException("Pet Type is Required");
                }
                if(pet.getId()==null){
                    Pet savedPet=new Pet();
                    pet.setId(savedPet.getId());

                }
            });

        }
        return super.save(object);
    }
    else{
        return null;
            }

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
