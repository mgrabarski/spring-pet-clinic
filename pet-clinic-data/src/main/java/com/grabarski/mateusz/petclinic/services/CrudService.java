package com.grabarski.mateusz.petclinic.services;

import java.util.Set;

/**
 * Created by Mateusz Grabarski on 12.09.2018.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
