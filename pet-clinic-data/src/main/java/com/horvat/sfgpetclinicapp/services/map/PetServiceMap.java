package com.horvat.sfgpetclinicapp.services.map;

import com.horvat.sfgpetclinicapp.model.Pet;
import com.horvat.sfgpetclinicapp.model.Vet;
import com.horvat.sfgpetclinicapp.services.CrudService;
import com.horvat.sfgpetclinicapp.services.PetServices;
import com.horvat.sfgpetclinicapp.services.VetServices;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetServices {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

}
