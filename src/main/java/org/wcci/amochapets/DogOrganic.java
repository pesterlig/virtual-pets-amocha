package org.wcci.amochapets;

public class DogOrganic extends Dogs implements Organic {

	// instance variables

	private int hunger;
	private boolean isCageDirty;

	// constructor

	public DogOrganic(String name, String type, int health, int happiness, double overallHealth, int hunger,
			boolean isCageDirty) {
		super(name, type, health, happiness, overallHealth);
		this.hunger = hunger;
		this.isCageDirty = isCageDirty;

	}

	// overloaded constructor

	public DogOrganic(String name, String type) {
		super(name, type);
		this.hunger = 50;
		this.isCageDirty = false;
	}

	// methods: feed, poop, water, pee, walk, cleanCage, tick, getters & setters

	@Override
	public void feed() {
		setHunger(getHunger() - (10 * (generator.nextInt(4) + 1)));
		if ((getHunger() < 50) && (generator.nextFloat() < 0.50f)) {
			poop();
		}
	}

	private void poop() {
		isCageDirty = true;
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
		isCageDirty = true;
		setHealth(getHealth() - 3);
	}

	@Override
	public void walk() {
		setHealth(getHealth() + 20);
		setHunger(getHunger() + (10 * (generator.nextInt(4) + 1)));
		if ((generator.nextFloat() < 0.90f)) {
			clean();
		}

	}

	public boolean clean() {
		return isCageDirty = false;

	}

	@Override
	public boolean tick() {
		setHunger(getHunger() + (2 * (generator.nextInt(4) + 1)));
		setHealth(getHealth() - (2 * (generator.nextInt(4) + 1)));
		setHappiness(getHappiness() - (2 * (generator.nextInt(4) + 1)));
		return isCageDirty;

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

	public boolean getIsCageDirty() {
		return isCageDirty;
	}

	public void setIsCageDirty(boolean isCageDirty) {
		this.isCageDirty = isCageDirty;
	}

}
