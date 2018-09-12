package com.grabarski.mateusz.petclinic.services;

import com.grabarski.mateusz.petclinic.domain.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
