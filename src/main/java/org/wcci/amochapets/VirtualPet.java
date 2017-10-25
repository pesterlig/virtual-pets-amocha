package org.wcci.amochapets;

import java.util.Random;

public abstract class VirtualPet {

	Random generator = new Random();
	

	// encapsulated instance variables
	private String name;
	private String type;
	private int health;
	private int happiness;

	// constructor for inheritance - not instantiation
	public VirtualPet(String name, String type, int health, int happiness) {
		this.name = name;
		this.type = type;
		this.health = health;
		this.happiness = happiness;
	}

	// Overloaded Constructor
	public VirtualPet(String name, String type) {
		this.name = name;
		this.type = type;
		this.health = 50;
		this.happiness = 50;
	}

	public void play() {
		setHappiness(getHappiness() + (20 * (generator.nextInt(4) + 1)));
	}

	// - Getters/Setters
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
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
	
	public double getWellness() {
		return (getHealth() + getHappiness()) / 2;
	}
	

	
	// subclasses must declare this method or be abstract:
	public abstract boolean tick(); 
	// individual for animal type
	// decreases health and happiness,
	// increase hunger, decreases oil level,
	// returns waste or dirty cage

	@Override
	public String toString() {
		return "Name: " + this.name + "\tType: " + this.type + "\tHealth " + this.health + "\tHappiness "+ this.happiness + "\tWellness  " + this.getWellness();
	}
}
