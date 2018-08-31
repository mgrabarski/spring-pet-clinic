package com.grabarski.mateusz.petclinic.domain.models;

import com.grabarski.mateusz.petclinic.domain.models.base.BaseEntity;

/**
 * Created by Mateusz Grabarski on 28.08.2018.
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}