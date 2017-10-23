package org.wcci.amochapets;

public class CatOrganic extends VirtualPet implements Organic {

	// instance variables

	private int hunger;
	private boolean isWaste;

	// constructor

	public CatOrganic(String name, String type, int health, int happiness, double overallHealth, int hunger,
			boolean waste) {
		super(name, type, health, happiness, overallHealth);
		this.hunger = hunger;
		this.isWaste = isWaste;
	}

	// overloaded constructor - name & type only

	public CatOrganic(String name, String type) {
		super(name, type);
		this.hunger = 50;
		this.isWaste = false;
	}

	// methods: feed, poop, water, pee, tick, getters & setters

	@Override
	public void feed() {
		setHunger(getHunger() - (10 * (generator.nextInt(4) + 1)));
		if ((getHunger() < 50) && (generator.nextFloat() < 0.50f)) {
			poop();
		}
	}

	private void poop() {
		isWaste = true;
		setHunger(getHunger() + 3);
	}

	@Override
	public void water() {
		setHealth(getHealth() + (10 * (generator.nextInt(4) + 1)));
		if ((getHealth() > 50) && (generator.nextFloat() < 0.50f)) {
			pee();
		}

	}

	private void pee() {
		isWaste = true;
		setHealth(getHealth() - 3);
	}

	@Override
	public boolean tick() {
		setHunger(getHunger() + (2 * (generator.nextInt(4) + 1)));
		setHealth(getHealth() - (2 * (generator.nextInt(4) + 1)));
		setHappiness(getHappiness() - (2 * (generator.nextInt(4) + 1)));
		return isWaste;
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

	public boolean getWaste() {
		return isWaste;
	}

	public void setIsWaste(boolean isCageDirty) {
		this.isWaste = isWaste;
	}

	
}
