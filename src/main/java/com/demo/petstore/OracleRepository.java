package com.demo.petstore;

import com.demo.petstore.domain.Pet;
import com.demo.petstore.domain.Repository;

import org.springframework.stereotype.Service;

//@Service
public class OracleRepository implements Repository{

    public void save(Pet pet){
        System.out.println("ORACLE: insert into pet(id, appearance, energy) values (" + pet.getId() + ", " + pet.getAppearance() + ", " + pet.getEnergy()+")");
    }
    
}
