package org.wcci.amochapets;

public class DogOrganic extends Dog implements Organic {

	// instance variables

	private int hunger;
	private int urgeToPoo;
	private int numPoopsInCage;

	// constructor

	public DogOrganic(String name, String type, int health, int happiness, int hunger) {
		super(name, type, health, happiness);
		this.hunger = hunger;
		this.urgeToPoo = 50;
		this.numPoopsInCage = 0;
	}

	// overloaded constructor

	public DogOrganic(String name, String type) {
		super(name, type);
		this.hunger = 50;
		this.urgeToPoo = 50;
		this.numPoopsInCage = 0;
	}

	// methods: feed, poop, water, pee, walk, cleanCage, tick, getters & setters

	@Override
	public void feed() {
		setHunger(getHunger() - (10 * (generator.nextInt(4) + 1)));
	}

	private void poopInCage() {
		setUrgeToPoo(0);
		setNumPoopsInCage(getNumPoopsInCage() + 1); 
	}

	@Override
	public void water() {
		setHealth(getHealth() + (10 * (generator.nextInt(4) + 1)));
	}

	@Override
	public void walk() {
		setHealth(getHealth() + 20);
		setHunger(getHunger() + (10 * (generator.nextInt(4) + 1)));
		this.setUrgeToPoo(0);
	}

	public void cleanCage() {
		numPoopsInCage = 0;
	}

	// tick -all needs increase as time passes,
	// hunger affects happiness, dirty cage affects health,
	// (both affect overall health - but not in this method)

	@Override
	public boolean tick() {
		setUrgeToPoo(getUrgeToPoo() + 10);
		setHunger(getHunger() + (2 * (generator.nextInt(4) + 1)));
		setHealth(getHealth() - (2 * (generator.nextInt(4) + 1)));
		boolean pooped = false;
		if (generator.nextInt(100) < getUrgeToPoo()) {
			poopInCage();
			pooped = true;
		}
		if (getIsCageDirty() == true) {
			setHealth(getHealth() - 5);
		}
		setHappiness(getHappiness() - (2 * (generator.nextInt(4) + 1)));
		if (getHunger() > 85) {
			setHappiness(getHappiness() - 5);
		}
		return pooped;
	}

	// getters & setters

	public int getUrgeToPoo() {
		return this.urgeToPoo;
	}

	private void setUrgeToPoo(int urgeToPoo) {
		if (urgeToPoo > 100) {
			this.hunger = 100;
		} else if (urgeToPoo < 0) {
			this.hunger = 0;
		} else {
			this.hunger = urgeToPoo;
		}
	}

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

	public int getNumPoopsInCage() {
		return numPoopsInCage;
	}

	public void setNumPoopsInCage(int numPoopsInCage) {
		this.numPoopsInCage = numPoopsInCage;
	}

	public boolean getIsCageDirty() {
		return getNumPoopsInCage() > 0;
	}

	

}
