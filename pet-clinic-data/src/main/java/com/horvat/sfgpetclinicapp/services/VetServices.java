package com.horvat.sfgpetclinicapp.services;

import com.horvat.sfgpetclinicapp.model.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById();

    Vet save(Vet vet);

    Set<Vet> findAll();
}
