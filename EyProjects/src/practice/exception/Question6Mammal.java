package practice.exception;

import practice.handsOn4.Question6Animal;

public class Question6Mammal {
	
	private String MammalName;
	private Question6Animal animalName;

	public Question6Mammal(String mammalName,Question6Animal animalName) {
		this.MammalName = mammalName;
		this.animalName = animalName;
	}

	public String getMammalName() {
		return MammalName;
	}

	public void setMammalName(String mammalName) {
		MammalName = mammalName;
	}

	public Question6Animal getAnimalName() {
		return animalName;
	}

	public void setAnimalName(Question6Animal animalName) {
		this.animalName = animalName;
	}

	@Override
	public String toString() {
		// Method called from class Question6Animal.
		return "Animal : "+getAnimalName().getName()+" MammalType=" + getMammalName();
	}
}
