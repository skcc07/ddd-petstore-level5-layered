package com.demo.petstore;

import com.demo.petstore.domain.Dog;
import com.demo.petstore.domain.Pet;
import com.demo.petstore.domain.Repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetstoreApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(PetstoreApplication.class, args);

		Pet pet = new Dog();   // new Cat();

		pet.setName("뽀삐");

		System.out.println(pet.speak());

		System.out.println("pet is eating");
		pet.eat();

		//System.out.println(dog);
		System.out.println(pet.toString());
		

		System.out.println("pet is sleeping");
		pet.sleep();

		//System.out.println(dog);
		System.out.println(pet.toString());

		System.out.println("ID         = " + pet.getId()         );
		System.out.println("Name       = " + pet.getName()       );
		System.out.println("Appearance = " + pet.getAppearance() );
		System.out.println("Energy     = " + pet.getEnergy()     );

		pet.save();

	}

}
