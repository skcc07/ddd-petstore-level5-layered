package com.demo.petstore.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cat")
public class Cat extends Pet{
    
    @Override
    public String speak() {
        return "냐옹";
    }

    @Override
	public void sleep(){
		energy = energy + 1;
        appearance = appearance + 1;
	}

}
