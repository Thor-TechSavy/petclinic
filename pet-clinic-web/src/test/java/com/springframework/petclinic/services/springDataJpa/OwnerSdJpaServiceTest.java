package com.springframework.petclinic.services.springDataJpa;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.repositories.OwnerRepository;
import com.springframework.petclinic.repositories.PetRepository;
import com.springframework.petclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerSdJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSdJpaService ownerSdJpaService;

    Owner returnOwner;

    public static final String LAST_NAME = "Ahuja";

    @BeforeEach
    void setUp() {
       returnOwner = Owner.builder().id(1L).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastname(any())).thenReturn(returnOwner);
        Owner owner = ownerSdJpaService.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME, owner.getLastname());
        verify(ownerRepository, times(1)).findByLastname(LAST_NAME);
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());
        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);
        Set<Owner> owner = ownerSdJpaService.findAll();

        assertNotNull(owner);
        assertEquals(2, owner.size() );
    }

    @Test
    void findById() {

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerSdJpaService.findById(1L);
        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Owner owner = ownerSdJpaService.findById(1L);
        assertNull(owner);
    }

    @Test
    void save() {
        Owner savedOwner = Owner.builder().id(1l).build();
        when(ownerRepository.save(any())).thenReturn(returnOwner);
        Owner owner = ownerSdJpaService.save(savedOwner);
        assertNotNull(owner);
    }

    @Test
    void delete() {
        ownerSdJpaService.delete(returnOwner);
        verify(ownerRepository, times(1)).delete(returnOwner);
    }

    @Test
    void deleteById() {

        ownerSdJpaService.deleteById(1L);

        verify(ownerRepository, times(1)).deleteById(1L);
    }
}