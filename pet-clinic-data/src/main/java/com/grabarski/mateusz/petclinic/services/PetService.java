package com.grabarski.mateusz.petclinic.services;

import com.grabarski.mateusz.petclinic.domain.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
