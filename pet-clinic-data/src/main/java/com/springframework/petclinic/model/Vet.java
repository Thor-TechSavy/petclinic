package com.springframework.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns =
    @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities =new HashSet<>();
}
