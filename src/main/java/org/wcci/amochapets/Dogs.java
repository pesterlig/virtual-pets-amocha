package org.wcci.amochapets;

public abstract class Dogs extends VirtualPet {

	public Dogs(String name, String type, int health, int happiness, double overallHealth) {
		super(name, type, health, happiness, overallHealth);

	}

	public Dogs(String name, String type) {
		super(name, type);

	}

	public abstract void walk();

}
