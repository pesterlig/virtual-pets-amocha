package org.wcci.amochapets;

public class CatOrganic extends VirtualPet implements Organic {

	// instance variables

	private int hunger;

	// constructor

	public CatOrganic(String name, String type, int health, int happiness, int hunger) {
		super(name, type, health, happiness);
		this.hunger = hunger;
	}

	// overloaded constructor - name & type only

	public CatOrganic(String name, String type) {
		super(name, type);
		this.hunger = 50;
	}

	// methods: feed, poop, water, pee, tick, getters & setters

	@Override
	public void feed() {
		setHunger(getHunger() - 20);
	}

	private void poop() {
		ClientVirtualPetShelterApp.getPetShelter().getLitterbox().addCrap();
	}

	@Override
	public void water() {
		setHealth(getHealth() + (10 * (generator.nextInt(4) + 1)));
		if ((getHealth() > 50) && (generator.nextFloat() < 0.50f)) {
			pee();
		}
	}

	private void pee() {
		ClientVirtualPetShelterApp.getPetShelter().getLitterbox().addPee();
	}

	@Override
	public boolean tick() {
		setHunger(getHunger() + (2 * (generator.nextInt(4) + 1)));
		setHealth(getHealth() - (2 * (generator.nextInt(4) + 1)));
		setHappiness(getHappiness() - (2 * (generator.nextInt(4) + 1)));
		setHappiness(getHappiness() - (2 * (generator.nextInt(4) + 1)));
		if (getHunger() > 85) {
			setHappiness(getHappiness() - 5);
		}
		boolean pooped = false;
		if ((getHunger() < 50) && (generator.nextFloat() < 0.50f)) {
			poop();
			pooped = true;
		}
		return pooped;
		
	}

	// getters & setters

	public int getHunger() {
		return hunger;
	}

	private void setHunger(int hunger) {
		if (hunger > 100) {
			this.hunger = 100;
		} else if (hunger < 0) {
			this.hunger = 0;
		} else {
			this.hunger = hunger;
		}

	}

	
}
