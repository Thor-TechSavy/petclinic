package com.springframework.petclinic.services;

import java.util.Set;

/**
 * Created by shivam (techSavyThor) on 05/01/2019
 */
public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
