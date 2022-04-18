package com.demo.petstore.domain;

import com.demo.petstore.PetstoreApplication;

public abstract class Pet {
    int appearance;
		public int getAppearance() {
			return appearance;
		}
		public void setAppearance(int appearance) {
			this.appearance = appearance;
		}

    int energy;
		public int getEnergy() {
			return energy;
		}
		public void setEnergy(int energy) {
			this.energy = energy;
		}

	int id;
		public int getId() {
			return id;
		}

	public abstract String speak();


	public void eat(){
		energy = energy + 1;
	}

	public void sleep(){
		energy = energy + 1;
	}

	public void save(){
		Repository repository = PetstoreApplication.getApplicationContext().getBean(Repository.class);
		repository.save(this);
	}


	@Override
	public String toString() {
		return "appearance = " + appearance + " & energy = " + energy;
	}


}
