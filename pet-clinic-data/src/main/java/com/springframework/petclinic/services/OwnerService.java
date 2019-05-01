package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Owner;
/**
 * Created by shivam (techSavyThor) on 04/30/2019
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String LastName);

}
