package com.grabarski.mateusz.petclinic.services;

import com.grabarski.mateusz.petclinic.domain.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
