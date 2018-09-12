package com.grabarski.mateusz.petclinic.domain.models;

import com.grabarski.mateusz.petclinic.domain.models.base.BaseEntity;

/**
 * Created by Mateusz Grabarski on 28.08.2018.
 */
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}