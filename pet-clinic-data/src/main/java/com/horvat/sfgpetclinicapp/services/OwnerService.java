package com.horvat.sfgpetclinicapp.services;

import com.horvat.sfgpetclinicapp.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OwnerService {

    Owner findById();

    Owner save(Owner owner);

    Set<Owner> findAll();

}
