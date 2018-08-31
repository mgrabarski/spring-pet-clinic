package com.grabarski.mateusz.petclinic.domain.models;

import com.grabarski.mateusz.petclinic.domain.models.base.BaseEntity;

import java.time.LocalDate;

/**
 * Created by Mateusz Grabarski on 28.08.2018.
 */
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}