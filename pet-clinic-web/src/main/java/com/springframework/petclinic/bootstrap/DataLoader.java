package com.springframework.petclinic.bootstrap;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.model.PetType;
import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.OwnerService;
import com.springframework.petclinic.services.PetTypeService;
import com.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        dog.setName("dog");
        PetType savedDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("Cat");
        PetType savedCatPetType=petTypeService.save(cat);


        Owner owner1=new Owner();
        owner1.setFirstName("Shivam");
        owner1.setLastname("Ahuja");
        owner1.setAddress("Baker street");
        owner1.setCity("London");
        owner1.setTelephone("12345");
        ownerService.save(owner1);

        Pet shivamsPet=new Pet();
        shivamsPet.setPetType(savedDogPetType);
        shivamsPet.setOwner(owner1);
        shivamsPet.setBirthDate(LocalDate.now());
        shivamsPet.setName("Milo");
        owner1.getPets().add(shivamsPet);


        Owner owner2 =new Owner();
        owner2.setFirstName("Thor");
        owner2.setLastname("TechSavy");
        owner2.setAddress("Stark Tower");
        owner2.setCity("New York");
        owner2.setTelephone("999999");
        ownerService.save(owner2);

        Pet thorsPet=new Pet();
        thorsPet.setPetType(savedCatPetType);
        thorsPet.setOwner(owner2);
        thorsPet.setBirthDate(LocalDate.now());
        thorsPet.setName("Katie");
        owner2.getPets().add(thorsPet);

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
