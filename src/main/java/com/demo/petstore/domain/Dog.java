package com.demo.petstore.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dog")
public class Dog extends Pet{

    @Override
    public String speak() {
        return "멍멍";
    }

    @Override
	public void eat(){
		energy = energy + 2;
	}
    
}
