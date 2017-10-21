package org.wcci.amochapets;

import java.util.Random;

public abstract class VirtualPet {

	Random generator = new Random();
	int randNum = generator.nextInt(4) + 1;

	// encapsulated instance variables
	private String name;
	private String type;
	// protected String description;
	private int health;
	private int happiness;
	private double overallHealth;

	// constructor for inheritance - not instantiation
	public VirtualPet(String name, String type, int health, int happiness, double overallHealth) {
		this.name = name;
		this.type = type;
		// this.description = description;
		this.health = health;
		this.happiness = happiness;
		this.overallHealth = overallHealth;
	}

	// Overloaded Constructor
	public VirtualPet(String name, String type) {
		this.name = name;
		this.type = type;
		// this.description = description;
		this.health = 50;
		this.happiness = 50;
		this.overallHealth = 50.00;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health > 100) {
			this.health = 100;
		} else if (health < 0) {
			this.health = 0;
		} else {
			this.health = health;
		}
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public double getOverallHealth() {
		return overallHealth;
	}

	public void setOverallHealth(double overallHealth) {
		this.overallHealth = overallHealth;
	}

	// methods needed:
	public abstract void tick();

	public abstract void computeHealth();

	public abstract void computeHappiness();

	public abstract void computeOverallHealth();

	public int play() {
		happiness += (20 * (randNum));
		if (happiness > 100) {
			happiness = 100;
		} else if (happiness < 0) {
			happiness = 0;
		}
		return happiness;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\tType: " + this.type + "\tHealth " + this.health + "\tHappiness "
				+ this.happiness + "\toverall health  " + this.overallHealth;
	}
}
