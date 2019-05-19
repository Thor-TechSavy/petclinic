package com.springframework.petclinic.bootstrap;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.model.PetType;
import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.OwnerService;
import com.springframework.petclinic.services.PetTypeService;
import com.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by shivam (techSavyThor) on 05/12/2019
 */
@Component
public class DataLoader implements CommandLineRunner {
   private final OwnerService ownerService;
   private final VetService vetService;
   private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog=new PetType();
        dog.setName("Milo");
        PetType savedDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        dog.setName("Katie");
        PetType savedCatPetType=petTypeService.save(cat);


        Owner owner1=new Owner();
        owner1.setFirstName("Shivam");
        owner1.setLastname("Ahuja");
        ownerService.save(owner1);

        Owner owner2 =new Owner();
        owner2.setFirstName("Thor");
        owner2.setLastname("TechSavy");
        ownerService.save(owner2);

        System.out.println("Owner's loaded");


        Vet vet1=new Vet();
        vet1.setFirstName("Tony");
        vet1.setLastname("Stark");
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("Ant");
        vet2.setLastname("Man");
        vetService.save(vet2);

        System.out.println("Vet's loaded");
    }
}
