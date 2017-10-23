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
		if (happiness > 100) {
			this.happiness = 100;
		} else if (happiness < 0) {
			this.happiness = 0;
		} else {
			this.happiness = happiness;
		}

	}

	public double getOverallHealth() {
		return overallHealth;
	}

	public void setOverallHealth(double overallHealth) {
		if (overallHealth > 100) {
			this.overallHealth = 100;
		} else if (overallHealth < 0) {
			this.overallHealth = 0;
		} else {
			this.overallHealth = overallHealth;
		}
		this.overallHealth = overallHealth;
	}

	// methods needed:
	public abstract boolean tick(); // individual for animal type 
////	decreases health and happiness, 
//	increase hunger, decreases oil level,
//	returns waste or dirty cage

	
	

//	public abstract void computeOverallHealth();

	public void play() {
	setHappiness(getHappiness() + (20 * (generator.nextInt(4) + 1)));

	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\tType: " + this.type + "\tHealth " + this.health + "\tHappiness "
				+ this.happiness + "\toverall health  " + this.overallHealth;
	}
}
