package com.springframework.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by shivam (techSavyThor) on 05/20/2019
 */
@Entity
@Table(name = "specialities")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Speciality extends BaseEntity{
    private String description;
    }
