package com.horvat.sfgpetclinicapp.services;

import com.horvat.sfgpetclinicapp.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
