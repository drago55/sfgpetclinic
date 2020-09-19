package com.horvat.sfgpetclinicapp.bootstrap;

import com.horvat.sfgpetclinicapp.model.Owner;
import com.horvat.sfgpetclinicapp.model.Vet;
import com.horvat.sfgpetclinicapp.services.OwnerService;
import com.horvat.sfgpetclinicapp.services.VetServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetServices vetServices;

    public DataLoader(OwnerService ownerService, VetServices vetServices) {
        this.ownerService = ownerService;
        this.vetServices = vetServices;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 =  new Owner();
        owner1.setId(1l);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2=  new Owner();
        owner2.setId(2l);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loading owners ....");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetServices.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2l);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetServices.save(vet2);

        System.out.println("Loading vets ....");
    }

}