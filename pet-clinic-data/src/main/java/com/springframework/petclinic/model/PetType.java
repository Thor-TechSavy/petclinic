package com.springframework.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PetType extends BaseEntity{

    @Column(name = "name")
    private String name;

}
