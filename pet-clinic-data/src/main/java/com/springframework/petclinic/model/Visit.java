package com.springframework.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Visit extends BaseEntity {
    @Column(name = "localdate")
    private LocalDate localDate;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
