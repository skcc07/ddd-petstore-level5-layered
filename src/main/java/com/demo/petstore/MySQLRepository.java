package com.demo.petstore;

import com.demo.petstore.domain.Pet;
import com.demo.petstore.domain.Repository;

import org.springframework.stereotype.Service;

@Service
public class MySQLRepository implements Repository{

    public void save(Pet pet){
        System.out.println("MYSQL: INSERT INTO PET_TABLE(ID, APPEARANCE, ENERGY) VALUES (" + pet.getId() + ", " + pet.getAppearance() + ", " + pet.getEnergy()+")");
    }
    
}
