package com.springframework.petclinic.services.springDataJpa;

import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.repositories.VetRepository;
import com.springframework.petclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

public class VetSdJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSdJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
    Set<Vet> vets = new HashSet<>();
    vetRepository.findAll().forEach(vets::add);
    return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
