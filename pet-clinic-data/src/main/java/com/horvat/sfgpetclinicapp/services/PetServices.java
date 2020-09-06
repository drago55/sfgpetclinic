package com.horvat.sfgpetclinicapp.services;

import com.horvat.sfgpetclinicapp.model.Pet;

import java.util.Set;

public interface PetServices {

    Pet findById();

    Pet save(Pet pet);

    Set<Pet> findAll();
}
